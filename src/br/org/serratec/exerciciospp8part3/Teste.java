package br.org.serratec.exerciciospp8part3;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {      
        Time fluminense = new Time("Fluminense", "Fernando Diniz");
        Time flamengo = new Time("Flamengo", "Dorival");

        List <Atleta> Fluminense = new ArrayList<>();
        Fluminense.add(new Atleta("P.H Ganso", "Meio Campo", fluminense));
        Fluminense.add(new Atleta("German Cano", "Centro Avante", fluminense));

        List <Atleta> Flamengo = new ArrayList<>();
        Flamengo.add(new Atleta("Pedro", "Centro Avante", flamengo));
        Flamengo.add(new Atleta("Arrascaeta", "Meio Campo", flamengo));

        for (Atleta x : Fluminense) {
            System.out.println(x);
        }

        for (Atleta y : Flamengo) {
            System.out.println(y);
        }
        
    }

}
