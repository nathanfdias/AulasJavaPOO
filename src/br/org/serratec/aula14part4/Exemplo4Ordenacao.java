package br.org.serratec.aula14part4;

import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.org.serratec.aula14part2.Aluno;

public class Exemplo4Ordenacao {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "m@gmail.com", 55);
        Aluno aluno2 = new Aluno("Mariana", "mar@gmail.com", 22);
        Aluno aluno3 = new Aluno("Marcola", "marquit@gmail.com", 37);
        Aluno aluno4 = new Aluno("Mussarela", "queijota@gmail.com", 19);
        Aluno aluno5 = new Aluno("Oscar", "peixounautaoscar@gmail.com", 26);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5);

        System.out.println("Ordenando pela Idade");
        alunos.stream().sorted().forEach(n-> System.out.println(n));//Ordenando Idade Antes Java8;

        System.out.println("Ordenando pela Idade");
        Comparator<Aluno> ordenarPeloNome = ((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        Collections.sort(alunos, ordenarPeloNome);
        alunos.forEach(a-> System.out.println(a));//Ordenando Nome depois do Java8;

        System.out.println("Ordenando por Email");
        alunos.sort((o1, o2) -> o1.getEmail().compareTo(o2.getEmail()));
        alunos.forEach(a -> System.out.println(a));//Ordenando Email depois do Java8;

    }
}
