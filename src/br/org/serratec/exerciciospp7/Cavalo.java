package br.org.serratec.exerciciospp7;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao{
    private String marcaFerradura;
    

    public Cavalo(String nome, LocalDate dataVacinacao, String raça, String marcaFerradura) {
        super(nome, dataVacinacao, raça);
        this.marcaFerradura = marcaFerradura;
    }
    
    public String getMarcaFerradura() {
        return marcaFerradura;
    }

    @Override
    public void amamentar() {
    }

    @Override
    public String emitirSom() {
        return null;
    }

    public void trocarFerradura() {

    }

    public void viajar() {

    }
}
