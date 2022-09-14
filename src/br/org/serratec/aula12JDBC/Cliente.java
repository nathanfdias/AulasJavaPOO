package br.org.serratec.aula12JDBC;

public class Cliente {
    private Integer codigo;
    private String nome;
    private String telefone;
    private String email;


    public Cliente(Integer codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
     @Override
     public String toString() {
         return "Nome: " + nome + ",Telefone: " + telefone + ",Email: " + email;
     }
     
    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
}
