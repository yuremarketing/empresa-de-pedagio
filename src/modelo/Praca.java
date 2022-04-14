package modelo;
import java.util.Set;


public class Praca {

    
    private Concessionaria consessionaria;
    private String cidade; 
    private Double totalRecebido;
    private Set<Guarita> guaritas; /* conjunto de praças */
    private Set<Tarifa> tarifas;  /* lista de tarifas  */

    public Concessionaria getConsessionaria() {
        return this.consessionaria;
    }

    public void setConsessionaria(Concessionaria consessionaria) {
        this.consessionaria = consessionaria;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getTotalRecebido() {
        return this.totalRecebido;
    }

    public void setTotalRecebido(Double totalRecebido) {
        this.totalRecebido = totalRecebido;
    }

    public Set<Guarita> getGuaritas() {
        return this.guaritas;
    }

    public void setGuaritas(Set<Guarita> guaritas) {
        this.guaritas = guaritas;
    }

    public Set<Tarifa> getTarifas() {
        return this.tarifas;
    }

    public void setTarifas(Set<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

}
