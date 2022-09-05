package br.org.serratec.aula7part4;

public class Setor {
    private Integer numero;
    private String descricao;
    
    public Setor(Integer numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nNumero: " + numero + "\nDescricao: " + descricao;
    }
    public Integer getNumero() {
        return numero;
    }
    public String getDescricao() {
        return descricao;
    }


}
