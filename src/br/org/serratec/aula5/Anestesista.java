package br.org.serratec.aula5;

public class Anestesista extends Medico{
    private String tipoAnestesia;

    public Anestesista(String empresa, Integer crm, String nome,String tipoAnestesia) {
        super(empresa, crm, nome);
        this.tipoAnestesia = tipoAnestesia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAnestesista: " + tipoAnestesia;
    }

    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

    @Override
    public double calcularPagamento() {
        return valorPago = super.calcularPagamento() + 1000;
    }
}
