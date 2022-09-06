package br.org.serratec.aula8part2;

import java.util.Arrays;
import java.util.List;

public class ExemploListasArrays {
    public static void main(String[] args) {
        //Não pode ser alterada
        List<String> cores = Arrays.asList("Amarelo", "Verde", "Azul");
        //cores.add("Branco");
        cores.set(0, "Branco");
        if(cores.isEmpty()) {
            System.out.println("Lista está Vazia!");
        }else {
            System.out.println(cores);
        }

        System.out.println("Possui verde: " + (cores.contains("Verde")? "Sim": "Não"));

        //Nem adicionar Nem Modificar
        List<String>meses = List.of("Jan", "Feb", "Mar", "Apr", "May", "Jun");
        System.out.println(meses);
    }
}
