package br.org.serratec.exerciciospp6;

public class Livro {
    private String autor;
    private String titulo;
    private double valor;

    public Livro(String autor, String titulo, double valor) {
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nAutor: " + autor + "\nTitulo: " + titulo + "\nValor: " + valor;
    }
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public double getValor() {
        return valor;
    }

    public void reajuste() {
        valor += valor * 0.06; 
    }

}
