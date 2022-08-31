package br.org.serratec.aula2;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        //nextDouble nextChar String = next "apenas"

        System.out.println("Entre com um valor: ");
        a = sc.nextInt();

        System.out.println("Entre com outro valor: ");
        b = sc.nextInt();

        System.out.println("\n O resultado da soma: " + (a+b));

        sc.close();
    }
}
