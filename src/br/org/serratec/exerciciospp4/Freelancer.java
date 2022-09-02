package br.org.serratec.exerciciospp4;

public class Freelancer extends Vendedor{
    private int diasTrabalhados;
    private double valorDias;
    
    public Freelancer(String nome, String cpf, int diasTrabalhados, double valorDias) {
        super(nome, cpf);
        this.diasTrabalhados = diasTrabalhados;
        this.valorDias = valorDias;
    }
    @Override
    public String toString() {
        return toString() + "\nDias trabalhados:" + diasTrabalhados + "\nValor dia: " + valorDias;
    }
    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }
    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }
    public double getValorDias() {
        return valorDias;
    }
    public void setValorDias(double valorDias) {
        this.valorDias = valorDias;
    }
}
