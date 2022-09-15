package br.org.serratec.aula14;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.finalizarPedido();

        //Classe Anônima;

        Pedido pedido2 = new Pedido() {
            public void finalizarPedido() {
                System.out.println("Pedido enviado com sucesso!");
            }
        };
        pedido2.finalizarPedido();
    }
}
