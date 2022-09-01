package br.org.serratec.exerciciospp2;

import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        MiniCalculadora calc = new MiniCalculadora();
        int opcao;
        double result;

        String menu = "Calculadora\n"+"1-Soma\n"+"2-Subtrai\n"+"3-Mult\n"+"4-Div\n"+"5-Final";
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Calculadora - JAVA", JOptionPane.QUESTION_MESSAGE));

        while (opcao != 5) {
            String num1 = JOptionPane.showInputDialog("Valor 1: ");
            String num2 = JOptionPane.showInputDialog("Valor 2: ");
            result = calc.calc(Double.parseDouble(num1), Double.parseDouble(num2), opcao);
            JOptionPane.showMessageDialog(null,result);
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,menu,
            "Calculadora - JAVA", JOptionPane.QUESTION_MESSAGE));
        }
    }
}
