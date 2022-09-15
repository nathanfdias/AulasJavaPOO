package br.org.serratec.aula14;

public interface Conta {
    public void transacao();

    //Método default - são métodos que contém implementação dentro da interface;

    default void investimento(){
        System.out.println("Você aplicou Investimentos");
    }

    
}
