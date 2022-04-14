package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import modelo.Concessionaria;

public class Repositorio {

    public void gravar(List consconcecionaria)  throws IOException {
        /* FileOutputStream, para persistir dados em um arquivo, crando uma instância
        passando o nome do arquivo*/
        FileOutputStream saidaArquivo = new FileOutputStream("pedagio.dat");
        ObjectOutputStream objSaida = new ObjectOutputStream(saidaArquivo);
        /* fazemos acesso ao metodo de gravação e informamos o objeto que será persistido */
        objSaida.writeObject(consconcecionaria);
        
    } 
   /* carrega as informações da lista */
    public List ler() throws IOException, ClassNotFoundException {

        FileInputStream entradaArquivo = new FileInputStream("pedagio.dat");
        ObjectInputStream objEntrada =  new ObjectInputStream(entradaArquivo);

        Object consessionarias = objEntrada.readObject();

        return (List) consessionarias;
         
    }
}
