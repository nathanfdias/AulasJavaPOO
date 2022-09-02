package br.org.serratec.exerciciospp4;

public class Fixo extends Vendedor{
    private double salarioBase;
    private double comissao;
    private double salarioBruto;

    public Fixo(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        //this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return toString()+"\nSalario Base: " + "\nSalario Bruto: " + salarioBruto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public double getSlarioBruto() {
        return salarioBruto;
    }
    public void setSlarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void calcularSalario(Double valorVenda) {
        salarioBruto = valorVenda * comissao + salarioBase; 
    }
}
