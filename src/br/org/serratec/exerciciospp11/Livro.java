package br.org.serratec.exerciciospp11;

public class Livro {
    private String titulo;
    private String autor;
    private Double preco;
    
    public Livro(String titulo, String autor, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    @Override
    public String toString() {
        return super.toString() + "\nLivro: \nTítulo: " + titulo + "\nAutor: " + autor + "\nPreço: " + preco;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public Double getPreco() {
        return preco;
    }
}
