package br.org.serratec.exerciciospp5;

public class Cidade {
    private String cidade;
    Estado estado;

    public Cidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }    
    
    public Estado getEstado() {
        return estado;
    }
}
