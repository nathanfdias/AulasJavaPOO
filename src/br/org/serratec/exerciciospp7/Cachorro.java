package br.org.serratec.exerciciospp7;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico{
    private boolean castrado;

    public Cachorro(String nome, LocalDate dataVacinacao, String raça, boolean castrado) {
        super(nome, dataVacinacao, raça);
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    @Override
    public boolean levarVeterinario() {
        return false;
    }

    @Override
    public boolean alimentar() {
        return false;
    }

    @Override
    public void amamentar() {
    }

    @Override
    public String emitirSom() {
        return null;
    }
    
}
