package br.org.serratec.aula6part2;

//A classe não poderá ser Instanciada - "Empregado empregado = new Empregado()"; Abstract
public abstract class Empregado {
    private String cpf;
    private String nome;
    protected Double salario;

    public Empregado(String cpf, String nome, Double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "\nEmpregado \nCpf: " + cpf + "\nNome: " + nome + "\nSalario: " + String.format("%.2f",salario);
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public Double getSalario() {
        return salario;
    }
    //É uma assinatura de método abstrato. Este método não tem implementação;
    //Todos os filhos obrigatoriamente deverão implementar esse método;
    public abstract void aumentarSalario();
}
