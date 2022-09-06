package br.org.serratec.exerciciospp7part2;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Proprietario p1 = new Proprietario("Rollandinho");
        Proprietario p2 = new Proprietario("Amaral");
        TotalValor total = new TotalValor();

        Carro carro1 = new Carro("HB20", LocalDate.of(2012, 8, 6), p1, "Sedan");
        Moto moto1 = new Moto("CB300", LocalDate.of( 2015, 2, 17), p2, 300);

        total.totalPagarCarro(carro1);
        total.totalPagarMoto(moto1);

        System.out.println(carro1 + "\nValor Cobrado: " + total.getTotalCarro()+ "\n");
        System.out.println(moto1 + "\nValor Cobrado: " + total.getTotalMoto()+ "\n");
    }
}
