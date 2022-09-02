package br.org.serratec.exerciciospp4;

public class Vendedor {
    protected String nome;
    protected String cpf;

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCpf: " + cpf + "\n";
    }
    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
