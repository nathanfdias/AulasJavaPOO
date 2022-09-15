package br.org.serratec.aula14part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1String {
    public static void main(String[] args) {
        List<String> times = Arrays.asList("Flamengo", "Fluminense", "Vasco", "Botafogo");
        times.forEach(t -> System.out.println(t));

        //Stream - método que permite algumas transformações, filtros e outras operação;

        times.stream().map(t -> t.substring(0, 3)).forEach(t -> System.out.println(t));
        List<String> timesAbreviados = times.stream().map(t-> t.substring(0, 3)).collect(Collectors.toList());
        timesAbreviados.forEach(t-> System.out.println(t));
    }
}
