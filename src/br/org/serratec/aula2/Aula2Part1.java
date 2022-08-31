package br.org.serratec.aula2;

public class Aula2Part1 {
    public static void main(String[] args) {

        int idade = 20;
        float altura = 1.85f;
        double peso = 89.90;
        String nome = new String("Ana");
        //Integer idade = new Integer(20);
        double a = 10.5;
        int b = (int)a;

        System.out.println("Dados:\n" + idade + "\n" + altura + "\n" + peso) ;
        System.out.println(nome.toUpperCase());
        System.out.println(b);
    }
}
