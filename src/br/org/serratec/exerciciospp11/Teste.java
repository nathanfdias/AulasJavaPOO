package br.org.serratec.exerciciospp11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        List <Livro> livros = new ArrayList<>(); 

        livros.add(new Livro("Júlio Werner", "Viagens ao centro da Terra", 150.));
        livros.add(new Livro("April O'Malley", "O Coliseu", 250.5));
        livros.add(new Livro("Ariano Suassuna", "Vida doce vida", 100.9));
   
        while(i <= -1) {
            System.out.println("\nAdicione um Livro");
            System.out.println("\nDigite o Autor: ");
            String autor = sc.next();
            System.out.println("\nDigite o Nome: ");
            String nome = sc.next();
            System.out.println("\nDigite o preço: ");
            double preco = sc.nextDouble();

            livros.add(new Livro(autor,nome,preco));
            i++;
        }

        Biblioteca biblioteca = new Biblioteca("Mauro Nakamura", "Shackespeare Library", new Livro[3]);  
            
        for (Livro livro : livros) {
            biblioteca.adicionarLivros(livro);
            System.out.println(livro + "\n---------------------------");
        }
        
        sc.close();
    }
}
