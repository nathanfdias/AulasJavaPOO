package br.org.serratec.aula7part3;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("NovaBase", PeriodoCurso.INTEGRAL);
        
        System.out.println("\nNome do curso: " + curso.getNome());
        System.out.println("\nDia de curso: " + PeriodoCurso.INTEGRAL.getDiasDaSemana());
    }
}
