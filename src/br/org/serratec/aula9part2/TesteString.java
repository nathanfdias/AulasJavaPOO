package br.org.serratec.aula9part2;

public class TesteString {
    public static void main(String[] args) {
        String texto = "Não Null";

        try {
            texto = texto.toUpperCase();
            System.out.println(texto); 
        } catch (NullPointerException e) {
            System.out.println("Error: Vazio");
            e.printStackTrace();
        }

    }
}
