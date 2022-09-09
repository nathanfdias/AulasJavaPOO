package br.org.serratec.aula9part5;

public class TesteConta {
    public static void main(String[] args) {
        Poupanca poupanca = new Poupanca("Joaquim", 1000.);

        try {
            poupanca.deposito(100.);
            poupanca.saque(12000.);
        } catch (ContaException e) {
            System.out.println(e.getMessage());
        }
    }
}
