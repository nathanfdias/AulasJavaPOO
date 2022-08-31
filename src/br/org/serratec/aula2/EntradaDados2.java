package br.org.serratec.aula2;

import java.util.Scanner;

public class EntradaDados2 {
    public static void main(String[] args) {
        String nome; //%s
        int idade; //%d
        double altura; //%f

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nome: ");
        nome = sc.next();

        System.out.println("Digite idade: ");
        idade = sc.nextInt();

        System.out.println("Digite altura: ");
        altura = sc.nextDouble();

        System.out.printf("%s tem %d anos e %.2f de altura", nome, idade, altura);

        sc.close();
    }
}
