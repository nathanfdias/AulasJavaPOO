package br.org.serratec.aula6part3;
//Um interface não pode ter instâncias;
//Não posso fazer - Conta conta1 = new Conta();
//É uma forma de substituir a herança;
//Toda inteface é criada para ter somente assinaturas;
//Interfaces não tem implementação;

public interface Conta {
    Double taxaBancaria = 2.50;
    //Não necessário colocar Abstract pois está implícito;
    //public abstract void saque(Double valor);
    public boolean saque(Double valor);
    public boolean deposito(Double valor);
}
