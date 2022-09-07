package br.org.serratec.exerciciospp8part2;

public class Cliente {
    private Double id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(Double id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone;
    }
    public Double getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getTelefone() {
        return telefone;
    }
}
