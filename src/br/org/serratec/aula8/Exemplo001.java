package br.org.serratec.aula8;

public class Exemplo001 {
    public static void main(String[] args) {
        String[] vetor = new String[3];
            vetor[0] = "Roni";
            System.out.println(vetor[0]);

        //String[] meses = new String[] {"Janeiro", "Fevereiro", "Março"};
        String[] meses = {"Janeiro", "Fevereiro", "Março"};    
            //System.out.println(meses[2]);

        for (String mes : meses) {
            System.out.println(mes);
        }
    }
}
