package br.org.serratec.aula10part2;

import java.util.Objects;

public class Empregado {
    private String cpf;
    private String nome;

  
    public Empregado(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nCpf: " + cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empregado other = (Empregado) obj;
        return Objects.equals(cpf, other.cpf);
    }
}
