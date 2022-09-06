package br.org.serratec.exerciciospp7part2;

public class TotalValor {
    private int totalCarro = 0;
    private int totalMoto = 0;

    public int getTotalCarro() {
        return totalCarro;
    }

    public int getTotalMoto() {
        return totalMoto;
    }

    public void totalPagarCarro(Oficina o) {
        totalCarro += o.trocarOleo();
        totalCarro += o.revisao();
        totalCarro += o.lavaVeiculo();
    }
    
    public void totalPagarMoto(Oficina o) {
        totalMoto += o.trocarOleo();
        totalMoto += o.revisao();
        totalMoto += o.lavaVeiculo();
    }

}
