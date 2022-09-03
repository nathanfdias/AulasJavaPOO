package br.org.serratec.aula5part2;

public class Imovel {
    private String tipo;
    private String local;
    private Double valor;
    //Relacionamento entre Imovel e Pessoa.
    private Pessoa pessoa;
    
    public Imovel(String tipo, String local, Double valor, Pessoa pessoa) {
        this.tipo = tipo;
        this.local = local;
        this.valor = valor;
        this.pessoa = pessoa;
    }
    public String getTipo() {
        return tipo;
    }
    public String getLocal() {
        return local;
    }
    public Double getValor() {
        return valor;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }

}
