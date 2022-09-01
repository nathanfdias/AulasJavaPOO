package br.org.serratec.aula4;

public class Caminhao extends Veiculo {
    private Integer cargaMaxima;

    public Caminhao(String chassi, String placa, String cor, Double valor, Integer cargaMaxima) {
        super(chassi, placa, cor, valor);
        this.cargaMaxima = cargaMaxima;
    }

    public Integer getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Integer cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    //Sobrescrita - Override
    @Override
    public void calcularIPVA() {
        valorIPVA = valor * 0.08;
    }

    @Override
    public String toString() {
        return chassi + "\n" + placa + "\n" + cor + "\n" + valor + "\n" + cargaMaxima;
    }

}
