package br.org.serratec.aula5;

public class PlanoDeSaude {
    protected String empresa;
    protected Double valorPago=80.0;
    protected Double valorISS=5.0;
    
    public PlanoDeSaude(String empresa) {
        this.empresa = empresa;
    }
    public String getEmpresa() {
        return empresa;
    }
    public Double getValorPago() {
        return valorPago;
    }
    public Double getValorISS() {
        return valorISS;
    }

    public double calcularPagamento() {
        valorPago = valorPago - valorPago * (valorISS/100); 
        return valorPago;
    }
}
