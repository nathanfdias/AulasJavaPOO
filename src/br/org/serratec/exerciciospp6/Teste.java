package br.org.serratec.exerciciospp6;

public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Marco Antõnio", "CiscoCNNA", 85.);
        Livro livro2 = new Livro("Kathy Sierra", "JAVA", 98.);

        Operacao operacao1 = new Operacao("Venda", livro1.getValor(), livro1);
        Operacao operacao2 = new Operacao("Empréstimo", livro2.getValor(), livro2);
        
        livro1.reajuste();
        operacao1.venderLivro();
        operacao2.emprestarLivro();

        System.out.println("\nLivro" + livro1.toString() + "\nOperação" + operacao1.toString()+ "\nValor Final: " + operacao1.getValorOperacao());
        System.out.println("\nLivro" + livro2.toString() + "\nOperação" + operacao2.toString() + "\nValor Final: " + operacao2.getValorOperacao());
    }
}
