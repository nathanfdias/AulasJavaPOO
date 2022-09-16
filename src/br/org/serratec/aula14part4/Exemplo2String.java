package br.org.serratec.aula14part4;

import java.util.Arrays;
import java.util.List;

import br.org.serratec.aula14part2.Aluno;

public class Exemplo2String {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "m@gmail.com", 55);
        Aluno aluno2 = new Aluno("Mariana", "mar@gmail.com", 22);
        Aluno aluno3 = new Aluno("Marcola", "marquit@gmail.com", 37);
        Aluno aluno4 = new Aluno("Mussarela", "queijota@gmail.com", 19);
        Aluno aluno5 = new Aluno("Oscar", "peixounautaoscar@gmail.com", 26);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

        //Filter - é usado para Filtro de dados e retorna um boolean;
        alunos.stream().filter(a -> a.getIdade() > 50).forEach(t -> System.out.println(t));// "a" é apenas uma varíavel para o boolean do filter;
        alunos.stream().filter(a -> a.getNome().startsWith("M")).forEach(t -> System.out.println("Nomes que começam com a letra M: "+t));
    }
}
