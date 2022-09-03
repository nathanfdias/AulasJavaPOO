package br.org.serratec.aula6part4;

public class Pessoa implements Tributacao{
    private String nome;
    private Double rendimentos;

    public Pessoa(String nome, Double rendimentos) {
        this.nome = nome;
        this.rendimentos = rendimentos;
    }    

    @Override
    public String toString() {
        return "\nPessoa \nNome:" + nome + "\nRendimentos: " + rendimentos;
    }
    
    public String getNome() {
        return nome;
    }

    public Double getRendimentos() {
        return rendimentos;
    }

    @Override
    public Double calcularImpostoDeRenda() {
        return rendimentos * impostoDeRendaPF;
    }

    @Override
    public Double calcularICMS() {
        return 0.0;
    }
    
}
