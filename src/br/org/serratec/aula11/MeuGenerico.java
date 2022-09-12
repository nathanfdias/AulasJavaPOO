package br.org.serratec.aula11;

public class MeuGenerico <T>{
    private T valor;

    public MeuGenerico(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Meu Generico [valor=" + valor + "]";
    }

    public T getValor() {
        return valor;
    }
}
