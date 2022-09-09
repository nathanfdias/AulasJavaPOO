package br.org.serratec.aula9;

public class TesteDivisao {
    public static void main(String[] args) {

        try {
            System.out.println(CalculoMedia.calcular(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("\nError: Divisão por Zero, verifique os valores!");
            e.printStackTrace();// Erro para o Desenvolvedor;
        } finally {
            System.out.println("Sempre é executado, mesmo que não caia no catch");
        }

    }
}
