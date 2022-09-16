package br.org.serratec.aula15;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ExemploSerializable {
    public static void main(String[] args) {
        //List<Fornecedor> leituraFornecedores = new ArrayList<>();
        List<Fornecedor> gravacaoFornecedores = new ArrayList<>();
        Fornecedor fornecedor1 = new Fornecedor("12232323232", "ABC123 LTDA", "abc@abc.com");
        Fornecedor fornecedor2 = new Fornecedor("15642323232", "XPTO LTDA", "xjm@gmail.com");
        Fornecedor fornecedor3 = new Fornecedor("99992323232", "TDA S/A", "cdcd@email.com");

        gravacaoFornecedores.add(fornecedor1);
        gravacaoFornecedores.add(fornecedor2);
        gravacaoFornecedores.add(fornecedor3);

        /*System.out.println("---------Gravar Objetos em Disco---------");
        //Serealização;
        try {
            FileOutputStream arquivoGravar = new FileOutputStream("/exemplos/fornecedores.dat");
            ObjectOutputStream gravarObjeto = new ObjectOutputStream(arquivoGravar);
            gravarObjeto.writeObject(gravacaoFornecedores);
            gravarObjeto.flush();
            gravarObjeto.close();
            arquivoGravar.flush();
            arquivoGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro !");
            e.printStackTrace();
        }*/

        /*System.out.println("----------Recuperando Objetos----------");
        //Desserealização;
        try {
            FileInputStream arquivoLeitura = new FileInputStream("/exemplos/fornecedores.dat");
            ObjectInputStream leituraObjeto = new ObjectInputStream(arquivoLeitura);
            leituraFornecedores = (ArrayList<Fornecedor>)leituraObjeto.readObject();
            leituraObjeto.close();
            arquivoLeitura.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(leituraFornecedores);*/


    }
}
