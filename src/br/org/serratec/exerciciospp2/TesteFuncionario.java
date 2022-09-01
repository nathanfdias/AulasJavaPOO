package br.org.serratec.exerciciospp2;

import javax.swing.JOptionPane;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Marcos", 3000.00);

        funcionario1.calcularINSS();
        funcionario1.calcularValeTransporte();
        funcionario1.calcularSalarioLiquido();

        JOptionPane.showMessageDialog(null,"Nome: "+ funcionario1.getNome() + "\nSalário: " + funcionario1.getSalario() + "\nINSS: " + funcionario1.getInss() + "\nVale Transporte: " + funcionario1.getValeTransporte() + "\nSalário Líquido: " + funcionario1.getSalarioLiquido());
    }
}
