package br.org.serratec.aula6part4;

public class Empresa implements Tributacao{
    private String razaoSocial;
    private double rendimentos;

    public Empresa(String razaoSocial, double rendimentos) {
        this.razaoSocial = razaoSocial;
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() { 
        return "\nPessoa Jurídica \nRazão Social: " + razaoSocial + "\nRendimentos: " + rendimentos;
        
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getRendimentos() {
        return rendimentos;
    }

    @Override
    public Double calcularImpostoDeRenda() {
        return rendimentos * impostoDeRendaPJ;
    }

    @Override
    public Double calcularICMS() {
        return rendimentos * icms;
    }
    
}
