package br.org.serratec.aula9part5;

public class Poupanca implements Conta{
    private String titular;
    private Double saldo;
    
    public Poupanca(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nTitular: " + titular + "\nSaldo: " + saldo;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public boolean saque(Double valor) {
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } 
        throw new ContaException("Valor de saque Insuficiente!");
    }

    @Override
    public boolean deposito(Double valor) {
        if(valor > 0){
            saldo += valor;
            return true;
        }
        throw new ContaException("Valor de depósito Inválido!");
    }
}
