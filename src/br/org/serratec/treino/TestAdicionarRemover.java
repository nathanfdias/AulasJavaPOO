package br.org.serratec.treino;

import javax.swing.JOptionPane;

public class TestAdicionarRemover {
    public static void main(String[] args) {
        AdicionarRemover addRemov = new AdicionarRemover();
        int opcao;
        double result;

        String num = JOptionPane.showInputDialog("Digite o Valor: "); 
        String menu = "Digite 1 para - Adicionar + 10\nDigite 2 para - Remover - 10\nDigite 3 para - Sair";
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Adicionar ou Remover", JOptionPane.QUESTION_MESSAGE));

        while (opcao != 3) {
            result = addRemov.calc(Double.parseDouble(num), opcao);
            JOptionPane.showMessageDialog(null,result);
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,menu,
            "Adicionar ou Remover", JOptionPane.QUESTION_MESSAGE));
        }
    }
}
