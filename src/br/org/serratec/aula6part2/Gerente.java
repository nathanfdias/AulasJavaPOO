package br.org.serratec.aula6part2;

public class Gerente extends Empregado {
    private String nivel;

    public Gerente(String cpf, String nome, Double salario, String nivel) {
        super(cpf, nome, salario);
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel: " + nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public void aumentarSalario() {
        salario *= 1.1;
    }
}
