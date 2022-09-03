package br.org.serratec.exerciciospp6;

public class Operacao implements Livraria{
    private String tipo;
    private Double valorOperacao;
    Livro livro;

    public Operacao(String tipo, Double valorOperacao, Livro livro) {
        this.tipo = tipo;
        this.valorOperacao = valorOperacao;
        this.livro = livro;
    }
    @Override
    public String toString() {
        return "\nProduto: Livro" + "\nVenda: " + livro.getAutor() + "\nTipo: " + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValorOperacao() {
        return valorOperacao;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public void emprestarLivro() {
        valorOperacao = valorOperacao * 0.02 + taxaEmprestimo; 
    }

    @Override
    public void venderLivro() {
        valorOperacao += valorOperacao *0.09;   
    }
    
}
