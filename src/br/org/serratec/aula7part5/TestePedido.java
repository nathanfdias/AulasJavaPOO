package br.org.serratec.aula7part5;

import java.time.LocalDate;

public class TestePedido {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(LocalDate.of(2012, 8, 22),Bebida.AGUA,Sanduiche.HOTDOG);
        pedido1.imprimirCardapio();

        System.out.println(pedido1);
    }
}
