package modelo;

import java.util.Set;

public class Concessionaria {
    private String nome;
    private  Set<Praca> pracas;
    private Double totalRecebido;
    
    private Concessionaria(String nome){
        this.nome = nome;
        this.totalRecebido = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Praca> getPracas() {
        return this.pracas;
    }

    public void setPracas(Set<Praca> pracas) {
        this.pracas = pracas;
    }

    public Double getTotalRecebido() {
        return this.totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }
}