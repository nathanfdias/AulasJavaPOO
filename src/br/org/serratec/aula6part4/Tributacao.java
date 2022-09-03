package br.org.serratec.aula6part4;
//Implementando Taxas em Taxas
public interface Tributacao extends Taxas, ImpostoDeRenda{
    public Double calcularICMS();
}
