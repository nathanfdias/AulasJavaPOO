package br.org.serratec.exerciciospp8part3;

public class Atleta {
    private String nomeAtleta;
    private String posicao;
    Time time;

    public Atleta(String nomeAtleta, String posicao, Time time) {
        this.nomeAtleta = nomeAtleta;
        this.posicao = posicao;
        this.time = time;
    }
    @Override
    public String toString() {
        return time.toString() + "\nNome: " + nomeAtleta + "\nPosição: " + posicao;
    }
    
    public Time getTime() {
        return time;
    }
    public String getNomeAtleta() {
        return nomeAtleta;
    }
    public String getPosicao() {
        return posicao;
    }
}
