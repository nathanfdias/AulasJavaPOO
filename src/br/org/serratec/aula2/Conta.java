package br.org.serratec.aula2;

public class Conta {
    public int numeroConta;
    public String titular;
    public double saldo;

    //Não tem retorno
    public void deposito(double valor){
        saldo += valor;
    }

    //Método com retorno
    public boolean saque(double valor) {
            if(saldo < valor) {
                return false;
            } else {
                return true;
            }
    } 
}
