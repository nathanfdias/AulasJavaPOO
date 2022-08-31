package br.org.serratec.treino;

public class DataBaseBank {
    public int accountNumber;
    public String name;
    public double accountBalance;

    public void deposit(double value){
        accountBalance += value;
    }

    public boolean withdrawl(double value){
        if(accountBalance < value) {
            return false;
        } else {
            return true;
        }
    }
}