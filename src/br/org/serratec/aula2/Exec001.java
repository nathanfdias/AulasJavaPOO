package br.org.serratec.aula2;

public class Exec001 {
    public static void main(String[] args) {
        int idade = 19;
        double altura = 1.65;

        if(idade > 18 || altura >= 1.80) {
            System.out.println("Competirá");
        } else {
            System.out.println("Não Competirá");
        }

        /*Ternário

        String resposta = idade > 18 || altura >= 1.80 ? "Competirá" : "Não Competirá";
        System.out.println(resposta); */
    }
}
