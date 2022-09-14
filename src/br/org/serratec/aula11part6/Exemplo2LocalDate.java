package br.org.serratec.aula11part6;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo2LocalDate {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1975, 6 ,11);
        LocalDate dataAtual = LocalDate.now();

        Period periodoNascAtual = Period.between(dataNascimento, dataAtual);
        System.out.println(periodoNascAtual.getYears());
        System.out.println(periodoNascAtual.getMonths());
        System.out.println(periodoNascAtual.getDays());
    }
}
