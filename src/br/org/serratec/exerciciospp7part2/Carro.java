package br.org.serratec.exerciciospp7part2;

import java.time.LocalDate;

public class Carro extends Veiculo{
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
            String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + this.categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public double lavaVeiculo() {
        return TipoServico.LAVAGEM.getValorPorServico();
    }
    @Override
    public double revisao() {
        if(getDataConserto().getMonthValue() == (8)) {
            double valor = TipoServico.REVISAO.getValorPorServico();
            return valor -= valor * 0.1;// *= 0.1;
        }
        return TipoServico.REVISAO.getValorPorServico();
    }
    @Override
    public double trocarOleo() {
        if(getDataConserto().getDayOfMonth() == 6) {
            double valor = TipoServico.OLEO.getValorPorServico();
            return valor -= 50;//-= 50;
        }
        return TipoServico.OLEO.getValorPorServico();
    }
}
