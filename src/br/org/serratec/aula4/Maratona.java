package br.org.serratec.aula4;

public class Maratona {
    protected String nome;
    protected String sexo;
    protected Integer idade;
    protected Double altura;
    
    public Maratona(String nome, String sexo, Integer idade, Double altura) {
        super();
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nAltura: " + altura;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /*public Boolean podeCompetir() {
        if (altura > 1.8 || idade > 18) ? true : false;
    }*/
}
