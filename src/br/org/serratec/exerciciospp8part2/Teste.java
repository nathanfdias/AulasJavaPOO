package br.org.serratec.exerciciospp8part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        double id = 1;
        List <Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nDigite os dados do Cliente");
            System.out.println("\nDigite o ID: ");
            id = sc.nextDouble();
            System.out.println("\nDigite o Nome: ");
            String nome = sc.next();
            System.out.println("\nDigite a idade: ");
            int idade = sc.nextInt();
            System.out.println("\nDigite o Telefone: ");
            String telefone = sc.next();

            clientes.add(new Cliente(id,nome,idade,telefone));
        } while (id > 0);

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        sc.close();
    }
}
