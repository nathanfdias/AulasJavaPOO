package br.org.serratec.aula6part4;

public class TotalImpostos {
    private Double total = 0.;

    public Double getTotal() {
        return total;
    }

    public void totalGeralTributos(Tributacao t) {
        total += t.calcularICMS();
        total += t.calcularImpostoDeRenda();
    }
}
