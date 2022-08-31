package br.org.serratec.exerciciospp1;

import java.util.Scanner;

public class Exec01 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Type a number: ");
        x = sc.nextInt();
        
        System.out.println("--------");
        for (int i = 1; i < 10; i++) {
            y = i*x;
            System.out.println("|" +(i+"x"+ x +"=" + y)+ "|");
        }
        System.out.println("--------");
        sc.close();
    }
}
