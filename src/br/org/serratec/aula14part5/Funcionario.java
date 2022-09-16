package br.org.serratec.aula14part5;

public class Funcionario {
    private Integer codigo;
    private String nome;
    private String setor;
    private Double salario;

    public Funcionario(Integer codigo, String nome, String setor, Double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + nome + "Setor" + setor + "}Salario{" + salario + "}";
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getSetor() {
        return setor;
    }
    public Double getSalario() {
        return salario;
    }

    public String buscar(String nome){
        return nome;
    }
}
