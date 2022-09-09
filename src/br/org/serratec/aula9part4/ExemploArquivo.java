package br.org.serratec.aula9part4;

//import java.io.FileNotFoundException;
//import java.io.FileReader;

public class ExemploArquivo {
    public static void main(String[] args) {
        int vetor[] = {100,200,400};
        int a = 10, b = 1;
        /*try {
            FileReader fr = new FileReader("/exemplos/exercicio.txt");
            System.out.println("Arquivo encontrado");
            System.out.println(a/b);
            System.out.println(vetor[10]);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Error: Divisão por 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vetor fora de faixa!");
        }*/

        //Todos erros em um Caminho mais curto e genérico;
        try {
            //FileReader fr = new FileReader("/exemplos/exercicio.txt");
            System.out.println("Arquivo encontrado");
            System.out.println(a/b);
            System.out.println(vetor[10]);
        } catch (Exception e) {
            System.out.println("Erros Genéricos");
        }
    }
}
