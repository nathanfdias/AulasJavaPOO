package br.org.serratec.aula7part2;

public class TV {
    private String modelo;
    private Double tamanho;
    private MarcaTV marca;

    public TV(String modelo, Double tamanho, MarcaTV marca) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "\nModelo: " + modelo + "\nTamanho: " + tamanho + "\nMarca TV: " + marca; 
    }
    public String getModelo() {
        return modelo;
    }
    public Double getTamanho() {
        return tamanho;
    }
    public MarcaTV getMarca() {
        return marca;
    }
}
