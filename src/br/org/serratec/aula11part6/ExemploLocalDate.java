package br.org.serratec.aula11part6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataDeEntrada = LocalDate.of(2022, 9, 12);

        System.out.println(dataAtual);
        System.out.println(dataDeEntrada);

        LocalDate dataConvertida = LocalDate.parse("2022-09-12");
        System.out.println(dataConvertida);

        System.out.println("Data atual após 3 dias: " + dataAtual.plusDays(3));
        System.out.println("Data atual 20 dias atrás: " + dataAtual.minusDays(20));
        System.out.println("Data atual 3 meses atrás: " + dataAtual.minus(3,ChronoUnit.MONTHS));

    }
}
