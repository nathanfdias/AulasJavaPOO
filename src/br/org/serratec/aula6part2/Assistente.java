package br.org.serratec.aula6part2;

public class Assistente extends Empregado{
    private Double adicional;

    public Assistente(String cpf, String nome, Double salario, Double adicional) {
        super(cpf, nome, salario);
        this.adicional = adicional;
    }
    @Override
    public String toString() {
        return super.toString() + "\nAdicional: " + adicional;
    }
    public Double getAdicional() {
        return adicional;
    }

    @Override
    public void aumentarSalario() {
        salario = salario * 1.10 + adicional;
    }  
}
