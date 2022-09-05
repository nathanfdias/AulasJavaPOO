package br.org.serratec.exerciciospp6part2;

public class TotalParticipantes {
    private int total = 0;

    public int getTotal() {
        return total;
    }

    public void totalPartic(Olimpiadas o) {
        total += o.totalParticipantes();
    }
}