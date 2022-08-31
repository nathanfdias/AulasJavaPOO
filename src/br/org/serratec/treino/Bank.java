package br.org.serratec.treino;

public class Bank {
    public static void main(String[] args) {
        DataBaseBank account1 = new DataBaseBank();
        account1.accountNumber = 2324;
        account1.name = "Maxuel";
        account1.accountBalance = 1000;
        
        DataBaseBank account2 = new DataBaseBank();
        account2.accountNumber = 1379;
        account2.name = "Alcides";
        account2.accountBalance = 5000;
        
        account1.deposit(500);
        account2.deposit(100);

        if (account1.withdrawl(200)) {
            System.out.println("Success!");
        } else {
            System.out.println("Insufficient money!");
        }

        System.out.println("Saldo Atual conta 1: " + account1.accountBalance);
        System.out.println("Saldo Atual conta 2: " + account2.accountBalance);
    }
}
