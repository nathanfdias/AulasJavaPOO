package br.org.serratec.aula3;

public class Medico {
    private Integer crm;
    private String nome;
    private Double salario;
    private Double valorConsulta;
    private static int contador;

    public Medico(Integer crm, String nome, Double salario, Double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        this.valorConsulta = valorConsulta;
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public Integer getCrm() {
        return crm;
    }

    public void setCrm(Integer crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void pagamentoDinheiro(){
        salario += valorConsulta;
    }

    public void pagamentoPlanoDeSaude() {
        salario = salario + valorConsulta * 0.70;
    }
}
