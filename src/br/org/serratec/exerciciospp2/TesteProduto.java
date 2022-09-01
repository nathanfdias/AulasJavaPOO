package br.org.serratec.exerciciospp2;

import javax.swing.JOptionPane;

public class TesteProduto {
    public static void main(String[] args) {
        ProdutoArroz produto1 = new ProdutoArroz("Arroz","Arroz Branco", 20.0, 15);

        produto1.calcularIcms();

        JOptionPane.showMessageDialog(null,"Nome: "+ produto1.getNome() + "\nDescrição: " + produto1.getDescricao() + "\nValor: " + produto1.getValor() + "\nQuantidade: " + produto1.getQuantidade());
    }
}
