package br.org.serratec.aula14part2;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class TesteAluno {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(new Aluno("Jorge", "j@gmail.com", 45), new Aluno("Maria", "m@gmail", 18));

        /*for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }*/

        //ExibirDadosAluno exibirDadosAluno = new ExibirDadosAluno();

        /*Consumer<Aluno> exibirDadosAluno = new Consumer<Aluno>() {
            //Evita criar classes, satisfaz um forEach e cria um classe anônima;
            @Override
            public void accept(Aluno t) {
                System.out.println("-------------Dados do Aluno-------------");
                System.out.println(t.getNome());
                System.out.println(t.getEmail());
                System.out.println(t.getIdade());      
            }
        };*/

        /*Consumer<Aluno> exibirDadosAluno = t -> {// Lambda
            System.out.println("-------------Dados do Aluno-------------");
            System.out.println(t.getNome());
            System.out.println(t.getEmail());
            System.out.println(t.getIdade());      
        };

        Consumer<Aluno> exibirDadosAluno = consumer;
        alunos.forEach(exibirDadosAluno);*/

        alunos.forEach(t -> {
            System.out.println("-------------Dados do Aluno-------------");
            System.out.println(t.getNome());
            System.out.println(t.getEmail());
        });
    }
}
