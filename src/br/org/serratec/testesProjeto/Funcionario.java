package br.org.serratec.testesProjeto;

import java.time.LocalDate;

public class Funcionario extends Pessoa implements IFuncionario{
    protected Double salarioBruto;
	public Dependente[] dependentes;
    private Double descontoINSS;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento, Double salarioBruto,
			Dependente[] dependentes) {
		super(nome, cpf, dataNascimento);
		this.salarioBruto = salarioBruto;
		this.dependentes = dependentes;
	}	
    
    public Double getDescontoINSS() {
        return descontoINSS;
    }
	
	public Double getSalarioBruto() {
		return salarioBruto;
	}

    @Override
    public Double descontoINSS() {
        if (salarioBruto <= 1212.00) {
            descontoINSS = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto= 0.09 - 18.18;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto = 0.12 - 91;
        } else if (salarioBruto <= 7087.22) {
            return salarioBruto= 0.14 - 163.82;
        } else if (salarioBruto > 7087.22) {
            return salarioBruto *= 0.14 - 163.82;
        }
        return null;
    }

	@Override
	public Double descontoIR() {
		return null;
	}

    public void adicionarDependentes(Dependente dependente) {
        for(int i = 0 ; i < dependentes.length ; i++) {
            if(dependentes[i] == null) {
                dependentes[i] = dependente;
                break;
            } 
        }
    } 

    public void listarDependentes() {
        for(int i = 0 ; i < dependentes.length ; i++) { 
            System.out.println(dependentes[i].getNome());
        }
    }

}
