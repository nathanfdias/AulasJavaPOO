package br.org.serratec.exerciciospp4;

public class Fixo extends Vendedor{
    private double salarioBase;
    private double comissao;
    public double valorVenda;
    public double salarioBruto;

    public Fixo(String nome, String cpf, double salarioBase, double comissao, double valorVenda) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.valorVenda = valorVenda;
        //this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return toString()+"\nSalario Base: " + salarioBase;// + "\nSalario Bruto: " + salarioBruto;
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
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }   
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public double getSalarioBruto() {
        //salarioBruto = calcularSalario();
        return salarioBruto + salarioBase;
    }

    public double calcularSalario() {
        return salarioBruto += valorVenda * comissao; 
    }
   
}
