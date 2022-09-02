package br.org.serratec.exerciciospp4;

import java.util.Scanner;

public class TesteVendedor {
    public static void main(String[] args) {
        int i = 0; 
        double valorVenda1, valorVenda2;

        Fixo vendedor1 = new Fixo("Joana", "190.200.763-24", 1300.0, 0.03);
        Fixo vendedor2 = new Fixo("Maria", "334.214.793-41",1300.0, 0.03);

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o vendedor:");
        System.out.println("1 -"+ vendedor1.getNome());
        System.out.println("2 -"+ vendedor2.getNome());
        int a = sc.nextInt();
        
        while (i > 0) {
            switch(a) {
                case 1:
                    System.out.println("\nDigite o valor da venda: ");
                    valorVenda1 = sc.nextInt();
                    System.out.println(("\n")+ valorVenda1);
                    i++;
                break;
                case 2:
                    System.out.println("\nDigite o valor da venda: ");
                    valorVenda2 = sc.nextInt();
                    System.out.println(("\n")+ valorVenda2);
                    i++;
                break;
                default:
                    System.out.println("\nValor Indefinido.");
                break;
            }
        }
        sc.close();
    }
}
