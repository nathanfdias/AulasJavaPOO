package br.org.serratec.exerciciospp5;

public class Endereco {
    private String rua;
    private String bairro;
    private String cep;
    Cidade cidade;
    Estado estado;

    public Endereco(String rua, String bairro, String cep, Cidade cidade, Estado estado) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    } 

    @Override
    public String toString() {
        return rua + " " + bairro + " " + cep + " " + cidade.getCidade() +  " " + estado.getEstado();
    }
    
    public Estado getEstado() {
        return estado;
    }
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public Cidade getCidade() {
        return cidade;
    }
    

}
