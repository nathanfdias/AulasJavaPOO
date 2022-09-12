package br.org.serratec.aula11part2;

import br.org.serratec.aula11.Funcionario;

public class TesteSorteio {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana", "a@gmail.com", 5600.);
        Funcionario f2 = new Funcionario("Julia", "j@gmail.com", 2600.);
        Funcionario f3 = new Funcionario("Lara", "l@gmail.com", 4600.);
        Funcionario f4 = new Funcionario("Mario", "m@gmail.com", 9000.);

        Sorteio<Funcionario> s1 = new Sorteio<>();
        s1.adicionar(f1);
        s1.adicionar(f2);
        s1.adicionar(f3);
        s1.adicionar(f4);

        System.out.println("\nQuem ganhou o sorteio foi: " + s1.sorteio());

        Sorteio<String> s2 = new Sorteio<>();
        String t1 = "Varmengo";
        String t2 = "Fluzão";
        String t3 = "Vasquinho da Colina";
        String t4 = "Faísca";

        s2.adicionar(t1);
        s2.adicionar(t2);
        s2.adicionar(t3);
        s2.adicionar(t4);

        System.out.println("\nQuem ganhou o sorteio foi: " + s2.sorteio());
    }
}
