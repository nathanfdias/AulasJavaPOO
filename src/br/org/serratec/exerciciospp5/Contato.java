package br.org.serratec.exerciciospp5;

public class Contato {
    private String nome;
    Telefone[] telefones;
    Endereco endereco;

    public Contato(String nome, Telefone[] telefones, Endereco endereco) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
    public String getNome() {
        return nome;
    }
    public Telefone[] getTelefones() {
        return telefones;
    }

    public void adicionarTelefones(Telefone telefone) {
        for(int i = 0 ; i < telefones.length ; i++) {
            if(telefones[i] == null) {
                telefones[i] = telefone;
                break;
            } 
        }
    } 
    
    public void listarTelefones() {
            for(int i = 0 ; i < telefones.length ; i++) { 
                System.out.println(telefones[i].getNumero());
            }
    }

    public void listarEndereco() {
        System.out.println(endereco.toString()+ "\n"+ endereco.toString());
    }   
}
