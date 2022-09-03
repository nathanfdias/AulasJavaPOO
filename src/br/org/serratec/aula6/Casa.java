package br.org.serratec.aula6;

public class Casa extends Imovel{
    private Boolean garagem;

    public Casa(String local, Double valor, Boolean garagem) {
        super(local, valor);
        this.garagem = garagem;
    }

    @Override
    public String toString() {
        return "\nCasa Garagem: "+ (garagem ? "Tem Garagem": "Não tem Garagem") + "\nLocal: " + local + "\nValor: " + valor;
    }

    public Boolean getGaragem() {
        return garagem;
    }

    public Double calcularITBI() {
        return valor * 0.035; 
    }
}
