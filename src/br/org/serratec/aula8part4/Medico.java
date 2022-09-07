package br.org.serratec.aula8part4;

public class Medico {
    private String crm;
    private String nome;
    private Double valorConsulta;

    public Medico(String crm, String nome, Double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorConsulta = valorConsulta;
    }
    @Override
    public String toString() {
        return "\nMedico " + "\nCRM: " + crm + "\nNome: " + nome + "\nValor Consulta: " + valorConsulta; 
    }
    public String getCrm() {
        return crm;
    }
    public String getNome() {
        return nome;
    }
    public Double getValorConsulta() {
        return valorConsulta;
    }
}
