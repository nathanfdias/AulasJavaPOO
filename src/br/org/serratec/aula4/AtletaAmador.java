package br.org.serratec.aula4;

public class AtletaAmador extends Maratona{
    private Boolean atestado;

    public AtletaAmador(String nome, String sexo, Integer idade, Double altura, Boolean atestado) {
        super(nome, sexo, idade, altura);
        this.atestado = atestado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAtestado: " + (atestado == true ? "Sim" : "Não");
    }

    public Boolean getAtestado() {
        return atestado;
    }

    public void setAtestado(Boolean atestado) {
        this.atestado = atestado;
    }
}
