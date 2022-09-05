package br.org.serratec.aula7part5;

public enum Bebida {
    REFRIGERANTE("Referigerante", 6.00),
    AGUA("Agua", 2.5),
    SUCO("Suco de Laranja", 7.0),
    CERVEJA("Cerveja", 8.0);

    private String tipo;
    private Double valor;

    private Bebida(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public String getTipo() {
        return tipo;
    }
    public Double getValor() {
        return valor;
    }

    @Override
	public String toString() {
		return "\nTipo:" + tipo + "\nValor" +valor;
	}
}
