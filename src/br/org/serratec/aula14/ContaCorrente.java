package br.org.serratec.aula14;

public class ContaCorrente implements Conta{

    @Override
    public void transacao() {
        System.out.println("Transação OK!");
    }

    @Override
    public void investimento(){
        System.out.println("Investimento OK!");
    }
    
}
