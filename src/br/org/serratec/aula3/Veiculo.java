package br.org.serratec.aula3;

public class Veiculo {
    public String placa;
    public String tipoCombustivel;
    public Double valor;

    public Double calcularIPVA(){
        if (tipoCombustivel.equals("Flex")){
            return valor * 0.03;
        } else {
            return valor * 0.04;
        }
    }

    public void valor(Double valor) {
        if(valor < 0) {
            this.valor = 0.0;
        } else {
            this.valor = valor;
        }
    }
}
