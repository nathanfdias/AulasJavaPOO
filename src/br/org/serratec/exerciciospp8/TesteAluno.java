package br.org.serratec.exerciciospp8;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Nathan", 93.0, 98.0));
        alunos.add(new Aluno("Pedro", 53.0, 78.0));
        alunos.add(new Aluno("Natalia", 75.0, 100.0));
        alunos.add(new Aluno("Anal Maria", 61.0, 58.0));

        for (Aluno alunoX : alunos) {
            if (alunoX.getNota1() > 0 && alunoX.getNota2() > 0) {
                alunoX.calcularMedia();
                System.out.println(alunoX);
            }else {
                System.out.println("\nValores incorentes.");
            }
        }
    }
}
