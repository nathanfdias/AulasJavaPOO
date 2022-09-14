package br.org.serratec.aula11part6;

import java.util.Calendar;

public class ExemploCalendar {
    public static void main(String[] args) {
        Calendar dataAtual = Calendar.getInstance();
        System.out.println(dataAtual.get(Calendar.DAY_OF_MONTH));
        System.out.println(dataAtual.get(Calendar.DAY_OF_WEEK));
        System.out.println(dataAtual.get(Calendar.YEAR));
        System.out.println(dataAtual.get(Calendar.SEPTEMBER));
        System.out.println(dataAtual.get(Calendar.HOUR));
    }
}
