package br.org.serratec.aula3;

public class TesteEscopoVariavel {
    public static void main(String[] args) {
        int valor = 100;

        //Escopo de Variavel G
        if(valor == 0) {
            int c = 10;
            System.out.println(c);
        }

    }
}