package br.org.serratec.aula3;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o código: ");
            Integer codigo = sc.nextInt();

            System.out.println("Digite a descrição: ");
            String descricao = sc.next();

            System.out.println("Digite o valor: ");
            Double valor = sc.nextDouble();

            Produto produto = new Produto(codigo, descricao, valor);
            System.out.println(produto);//Apenas Remover o warning
            System.out.println("Total geral de Produtos Cadastrados: "+ Produto.getTotalProdutos());
        }
        sc.close();
    }
}
