package br.org.serratec.aula8;

public class Empregado {
    private String nome;
    private String telefone;
    
    public Empregado(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nTelefone: " + telefone;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }

}

