package br.org.serratec.exerciciospp6part2;

public class Pais extends Atleta{
    private String nomePais;

    public Pais(String nome, double peso, String nomePais) {
        super(nome, peso);
        this.nomePais = nomePais;
    }
    public String getNomePais() {
        return nomePais;
    }
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
    @Override
    public String toString() {
        return "\nPaís: " + nomePais + "\nNome: " + nome;
    }

}
