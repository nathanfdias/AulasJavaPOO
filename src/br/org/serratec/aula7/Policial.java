package br.org.serratec.aula7;
//Essa classe não poderá ter filhos: IMUTÁVEL
//Imutável: Math
//public final class Policial
public class Policial {
    private String nome;
    private String matricula;

    public Policial(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override //Final no método Proíbe sobreescrita
    public final String toString() {
        return "\nNome: " + nome + "\nMatricula: " + matricula;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
}
