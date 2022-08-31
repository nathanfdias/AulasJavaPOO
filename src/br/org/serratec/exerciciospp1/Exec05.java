package br.org.serratec.exerciciospp1;

import java.util.Scanner;

public class Exec05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x,ant,suc;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        ant = x - 1;
        suc = x + 1;

        System.out.println("Numero: "+ x + "\nAntecessor: "+ ant + "\nSucessor: " + suc);

        sc.close();
    }
}
