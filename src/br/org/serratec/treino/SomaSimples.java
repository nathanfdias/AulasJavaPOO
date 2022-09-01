package br.org.serratec.treino;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, s;

        System.out.println("Digite um número: ");
        n1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        n2 = sc.nextInt();

        s = n1 + n2;

        System.out.println("A soma entre número: "+ n1 + " + "+ n2 + " = "+ s);

        sc.close();
    }
}