package br.org.serratec.exerciciospp7part2;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
    protected String modelo; 
    protected LocalDate dataConserto;
    protected Proprietario proprietario;
   
    public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }
    @Override
    public String toString() { 
        return "Veiculo" + "\nModelo: " + modelo + "\nData Conserto: " + dataConserto + "\nProprietario: " + proprietario.getNome(); 
    }
    public String getModelo() {
        return modelo;
    }
    public LocalDate getDataConserto() {
        return dataConserto;
    }
    public Proprietario getProprietario() {
        return proprietario;
    }
    
    /*@Override
    public double lavaVeiculo() {
        return 0;
    }
    @Override
    public double revisao() {
        return 0;
    }
    @Override
    public double trocarOleo() {
        return 0;
    }*/
}
