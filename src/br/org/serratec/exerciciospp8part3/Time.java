package br.org.serratec.exerciciospp8part3;

public class Time {
    private String nometime;
    private String nomeTreinador;

    public Time(String nometime, String nomeTreinador) {
        this.nometime = nometime;
        this.nomeTreinador = nomeTreinador;

    }
    @Override
    public String toString() {
        return "\nTime: " + nometime + "\nTreinador: " + nomeTreinador;
    }

    public String getNometime() {
        return nometime;
    }
    public String getNomeTreinador() {
        return nomeTreinador;
    }
}
