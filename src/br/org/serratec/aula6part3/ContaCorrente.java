package br.org.serratec.aula6part3;

public class ContaCorrente implements Conta{
    private Double saldo;
    private String titular;

    public ContaCorrente(Double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    @Override
    public String toString() {
        return "\nTitular: " + titular + "\nSaldo: " + saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public boolean saque(Double valor) {
        if(saldo > valor) {
            saldo -= valor + taxaBancaria;
            return true;
        }
        return false;
    }

    @Override
    public boolean deposito(Double valor) {
        if (valor > 0 && valor < 10000) {
            saldo += valor;
            return true;
        }
        return false;
    }
}
