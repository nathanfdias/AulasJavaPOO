package br.org.serratec.aula6part2;

public abstract class Auxiliar extends Empregado{
    protected String categoria;

    public Auxiliar(String cpf, String nome, Double salario, String categoria) {
        super(cpf, nome, salario);
        this.categoria = categoria;
    } 
    public String getCategoria() {
        return categoria;
    }   
}
