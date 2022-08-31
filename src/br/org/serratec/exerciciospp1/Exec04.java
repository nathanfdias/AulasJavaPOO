package br.org.serratec.exerciciospp1;

import javax.swing.JOptionPane;

public class Exec04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        String tel = JOptionPane.showInputDialog("Telefone: ");
        String email = JOptionPane.showInputDialog("Email: ");
        String salar = JOptionPane.showInputDialog("Salário: ");

        Double salario = Double.parseDouble(salar);
        System.out.println(nome+email+tel);
        JOptionPane.showMessageDialog(null,"Salário com bonus: "+ ((salario*0.1) + salario));
    }
}
