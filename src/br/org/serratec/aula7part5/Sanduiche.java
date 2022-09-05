package br.org.serratec.aula7part5;

public enum Sanduiche {
    HAMBURGUER("Hamburguer de Siri", 20.0),
    MISTO("Misto", 8.),
    HOTDOG("Cachorro Quente", 10.0);

    private String tipoSanduiche;
    private Double valor;  

    private Sanduiche(String tipoSanduiche, Double valor) {
        this.tipoSanduiche = tipoSanduiche;
        this.valor = valor;
    }

    public String getTipoSanduiche() {
        return tipoSanduiche;
    }

    public Double getValor() {
        return valor;
    }

    @Override
	public String toString() {
		return "\nTipo:" + tipoSanduiche + "\nValor: " +valor;
	}
}
