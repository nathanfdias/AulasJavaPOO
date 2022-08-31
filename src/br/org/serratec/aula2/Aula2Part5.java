package br.org.serratec.aula2;

public class Aula2Part5 {
    public static void main(String[] args) {
        String[]vetor = {"Ana","Matheus","Marcola","Lara"};

        /*for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        Usando For each */

        for (String nome : vetor) {
            System.out.println(nome);    
        }
    }
}
