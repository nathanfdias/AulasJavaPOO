package br.org.serratec.aula6;

public class Proprietario {
    private String nome;

    public Proprietario(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "\nProprietario: " + nome;
    }

    public String getNome() {
        return nome;
    }
}
