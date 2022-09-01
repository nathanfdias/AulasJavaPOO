package br.org.serratec.exerciciospp2;

public class Funcionario {
    private String nome;
    private double salario;
    private double inss;
    private double valeTransporte;
    private double salarioLiquido;
    private static int contador;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        contador ++;
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Funcionario.contador = contador;
    }

    public void calcularINSS() {
        inss = salario * 0.11;
    }

    public void calcularValeTransporte() {
        valeTransporte  = salario * 0.06;
    }

    public void calcularSalarioLiquido() {
        salarioLiquido = salario - (inss + valeTransporte);
    }
    
    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
    
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

}
