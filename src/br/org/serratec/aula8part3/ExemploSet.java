package br.org.serratec.aula8part3;

import java.util.HashSet;
import java.util.Set;
//import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();
        //Não Repete e Ordem Aletória;
        //Set<String> cores = new TreeSet<>(); Alfabético Ordem
        cores.add("Azul");
        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Branco");
        cores.add("Azul");

        System.out.println(cores);
    }
}
