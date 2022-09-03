package br.org.serratec.aula6;

public class Imovel {
    protected String local;
    protected Double valor;
    protected Proprietario proprietario;

    public Imovel(String local, Double valor) {
        this.local = local;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nLocal: " + local + "\nValor: " + valor;
    }
    
    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getLocal() {
        return local;
    }
    public Double getValor() {
        return valor;
    }
}
