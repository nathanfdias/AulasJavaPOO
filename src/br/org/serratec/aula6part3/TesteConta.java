package br.org.serratec.aula6part3;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(14500.,"Nathan");

        cc.deposito(1000.);
        cc.saque(500.);

        System.out.println("Bank: " + cc.toString());
    }
}
