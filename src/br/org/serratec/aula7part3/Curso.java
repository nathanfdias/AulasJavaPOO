package br.org.serratec.aula7part3;

public class Curso {
    private String nome;
    private PeriodoCurso periodo;
    
    public Curso(String nome, PeriodoCurso periodo) {
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPeriodo: " + periodo;
    }
    
    public String getNome() {
        return nome;
    }
    public PeriodoCurso getPeriodo() {
        return periodo;
    }
}
