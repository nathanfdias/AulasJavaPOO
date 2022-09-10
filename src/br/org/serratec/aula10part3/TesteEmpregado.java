package br.org.serratec.aula10part3;

import br.org.serratec.aula10part2.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("123", "Ronaldo");
        Empregado empregado2 = new Empregado("321", "Roberta");

        System.out.println(empregado1);
        System.out.println(empregado2);

        if(empregado1.equals(empregado2)) {
            System.out.println("Iguais!");
        }else {
            System.out.println("Diferentes!");
        }
    }
}
