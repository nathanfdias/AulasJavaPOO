package br.org.serratec.exerciciospp7;

import java.time.LocalDate;

public abstract class Mamifero extends Animal{
    protected String raça;
    
    public Mamifero(String nome, LocalDate dataVacinacao, String raça) {
        super(nome, dataVacinacao);
        this.raça = raça;
    }
    
    public String getRaça() {
        return raça;
    }    

    public abstract void amamentar();
}
