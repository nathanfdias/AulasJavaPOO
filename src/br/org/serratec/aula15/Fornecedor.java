package br.org.serratec.aula15;

import java.io.Serializable;

public class Fornecedor implements Serializable{
    private static final long serialVersionUID = 1L;
    private String cnpj;
    private String nome;
    private String email;

    public Fornecedor(String cnpj, String nome, String email) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fornecedor: " + cnpj +  ", " + nome + ", " + email;
    }

    public String getCnpj() {
        return cnpj;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }


}
