package br.org.serratec.aula11part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Robert", "betoportugol@gmail.com", 15);
        Pessoa p2 = new Pessoa("Zezé", "zedobosco@gmail.com", 85);
        Pessoa p3 = new Pessoa("Josélio", "joselio@gmail.com", 54);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        Collections.sort(pessoas);
        System.out.println(pessoas);
        System.out.println("\nÚltimo: "+ pessoas.get(2));

        for (Pessoa pessoa : pessoas) {
            System.out.println("\n"+ pessoa);
        }

    }
}
