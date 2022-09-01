package br.org.serratec.aula4;
//Herança
public class Gerente extends Funcionario{
    private String tipo;
    
    public Gerente(String cpf, String nome, Double salario, String tipo) {
        super(cpf, nome, salario);//Puxando do Funcionario
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
