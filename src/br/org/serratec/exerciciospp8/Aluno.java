package br.org.serratec.exerciciospp8;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double media;
    
    public Aluno(String nome, Double nota1, Double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    @Override
    public String toString() {
        return "\nAluno" + "\nNome " + nome + "\nPrimeira Nota: " + nota1 + "\nSegunda Nota: " + nota2 + "\nMedia: "+ media;
    }
    public String getNome() {
        return nome;
    }
    public Double getNota1() {
        return nota1;
    }
    public Double getNota2() {
        return nota2;
    }

    public double calcularMedia() {
        return media = (nota1 + nota2) /2;
    }
}
