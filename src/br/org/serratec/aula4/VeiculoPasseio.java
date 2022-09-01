package br.org.serratec.aula4;

public class VeiculoPasseio extends Veiculo {
    private Integer quantidadePortas;
    
    public VeiculoPasseio(String chassi, String placa, String cor, Double valor, Integer quantidadePortas) {
        super(chassi, placa, cor, valor);
        this.quantidadePortas = quantidadePortas;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
