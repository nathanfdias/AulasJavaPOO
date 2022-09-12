package br.org.serratec.aula11part3;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String email;
    private Integer idade;

    public Pessoa(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Email: " + email + ", Idade: " + idade;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Integer getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Pessoa o) {
        return idade - o.getIdade();
    }
}
