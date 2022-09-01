package br.org.serratec.aula3;

//Loombok
public class Pessoa {
    private Integer codigo; //Classes
	private String nome;
	private Double peso;
	private Double altura;

    public Pessoa(){
        System.out.println("Novo Objeto criado"); //Provando que Passa 2 vezes
    }

    public Pessoa(Integer codigo, String nome, Double peso, Double altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Integer getCodigo() { //Atributos
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    private double calcularIMC() { //Metodos
        Double imc = peso/(altura*altura);
        return imc;
    }

    public String resultadoIMC() {

        if(calcularIMC() < 18.5){
            return "Abaixo do peso";
        } else if(calcularIMC() >= 18.5 && calcularIMC() < 24.9) {
            return "Peso ideal";
        } else {
            return "Acima do peso";
        }
    }
}
