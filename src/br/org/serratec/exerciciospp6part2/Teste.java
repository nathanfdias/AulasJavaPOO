package br.org.serratec.exerciciospp6part2;

public class Teste {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("Anderson Silva", 98.);
        Atleta a2 = new Atleta("Joseph Mall", 58.);
        Atleta a3 = new Atleta("Conor O'Malley", 91.5);

        Pais a1p = new Pais(a1.getNome(), a1.getPeso(),"Brasil");
        Pais a2p = new Pais(a2.getNome(), a2.getPeso(),"EUA");
        Pais a3p = new Pais(a3.getNome(), a3.getPeso(),"Brasil");

        a1.verificaSituacao();
        a2.verificaSituacao();
        a3.verificaSituacao();

        System.out.println("\nInscritos: " + a1p.toString());
        System.out.println("\nInscritos: " + a2p.toString());
        System.out.println("\nInscritos: " + a3p.toString());
        System.out.println("\nO atleta: " + a1.getNome() +"-"+ a1.getResult());
        System.out.println("\nO atleta: " + a2.getNome() +"-"+ a2.getResult());
        System.out.println("\nO atleta: " + a3.getNome() +"-"+ a3.getResult());
    }
}
