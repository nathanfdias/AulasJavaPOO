package br.org.serratec.aula7part5;

import java.time.LocalDate;

public class Pedido {
    private LocalDate dataPedido; //Trabalhar com Data
    private Bebida bebida;
    private Sanduiche sanduiche;

    public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
        this.dataPedido = dataPedido;
        this.bebida = bebida;
        this.sanduiche = sanduiche;
    }

    @Override
    public String toString() {
        return "\nPedido:" + "\nData Pedido: " + dataPedido + "\nBebida: " + bebida + "\nSanduiche: " + sanduiche;  
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public Bebida getBebida() {
        return bebida;
    }
    public Sanduiche getSanduiche() {
        return sanduiche;
    }

    public void imprimirCardapio() {
        for (Bebida beb: Bebida.values()) {
            System.out.println("---------------");
            System.out.println(beb);
        }
        
        for (Sanduiche sanduiche: Sanduiche.values()) {
            System.out.println("---------------");
            System.out.println(sanduiche);
        }
    }
}
