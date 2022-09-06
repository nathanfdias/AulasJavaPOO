package br.org.serratec.aula8part2;

import java.util.ArrayList;
import java.util.List;

import br.org.serratec.aula8.Empregado;

public class ExemploEmpregado {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        empregados.add(new Empregado("Lucas", "1314"));
        empregados.add(new Empregado("Sabrina", "1834"));
        empregados.add(new Empregado("Max", "4194"));

        for (Empregado x : empregados) {
            System.out.println(x);
        }
    }
}
