import modelo.Concessionaria;
import modelo.Praca;

public class App {
    public static void main(String[] args) throws Exception {
        
        Concessionaria minhaConcessionaria = new Concessionaria("Concessionaria");         

        minhaConcessionaria.setNome("Jorlan");
        
        Praca praca01 = new Praca();
        praca01.setCidade("curitiba");

        Praca praca02 = new Praca();
        praca02.setCidade("São Paulo");

        Praca praca03 = new Praca();
        praca03.setCidade("Rio de Janeiro");


    }
}
