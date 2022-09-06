package br.org.serratec.exerciciospp7part2;

import java.time.LocalDate;

public class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario,
            int cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCilindradas: " + this.cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public double lavaVeiculo() {
        return TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public double revisao() {
        return TipoServico.REVISAO.getValorPorServico();
    }

    @Override
    public double trocarOleo() {
        return TipoServico.OLEO.getValorPorServico();
    }
   
}
