package br.org.serratec.aula4;

public class Veiculo {
    protected String chassi;
    protected String placa;
    protected String cor;
    protected Double valor;
    protected Double valorIPVA;

    public Veiculo(String chassi, String placa, String cor, Double valor) {
        this.chassi = chassi;
        this.placa = placa;
        this.cor = cor;
        this.valor = valor;
    } 

    @Override
    public String toString() {
        return chassi + "\n" + placa + "\n" + cor + "\n" + valor;
    }

    public Double getValorIPVA() {
            return valorIPVA;
    }
    public void setValorIPVA(Double valorIPVA) {
            this.valorIPVA = valorIPVA;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void calcularIPVA(){
        valorIPVA = valor * 0.04;
    }
}