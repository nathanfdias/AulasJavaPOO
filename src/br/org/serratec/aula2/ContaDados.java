package br.org.serratec.aula2;

public class ContaDados {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.numeroConta = 2324;
        conta1.titular = "Maxuel";
        conta1.saldo = 1000;
        
        Conta conta2 = new Conta();
        conta2.numeroConta = 2561;
        conta2.titular = "Janilton";
        conta2.saldo = 5000;
        
        conta1.deposito(500);
        conta2.deposito(100);

        if (conta1.saque(200)) {
            System.out.println("Saque efetuado com Sucesso!");
        } else {
            System.out.println("Dinheiro em conta insuficiente!");
        }

        System.out.println("Saldo Atual conta 1: " + conta1.saldo);
        System.out.println("Saldo Atual conta 2: " + conta2.saldo);
    }
}
