package br.org.serratec.aula2;

import javax.swing.JOptionPane;

public class EntradaDados3 {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        String num2 = JOptionPane.showInputDialog("Entre com o segundo número: ");

        Double nota1 = Double.parseDouble(num1);
        Double nota2 = Double.parseDouble(num2);

        JOptionPane.showMessageDialog(null,"Média: "+ (nota1+nota2)/2);
    }
}
