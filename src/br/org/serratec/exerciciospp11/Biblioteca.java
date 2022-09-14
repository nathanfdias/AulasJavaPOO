package br.org.serratec.exerciciospp11;

public class Biblioteca{
    private String responsavel;
    private String nomeBibli;
    Livro[] livros;


    public Biblioteca(String responsavel, String nomeBibli, Livro[] livros) {
        this.responsavel = responsavel;
        this.nomeBibli = nomeBibli;
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nomeBibli + "Responsavel: " + responsavel;
    }

    public Livro[] getLivro() {
        return livros;
    }
    
    public String getResponsavel() {
        return responsavel;
    }  

    public String getNomeBibli() {
        return nomeBibli;
    }

    public void adicionarLivros(Livro xLivro) {
        for(int j = 0 ; j < livros.length ; j++) {
            if(livros[j] == null) {
                livros[j] = xLivro;
                break;
            } 
        }
    }

    public void listar() {
    }


    public double calcularTotal() {
        return 0.0;
    }
}
