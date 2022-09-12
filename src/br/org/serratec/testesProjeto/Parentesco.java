package br.org.serratec.testesProjeto;

public enum Parentesco {
    FILHO('F'),
	SOBRINHO('S'),
	OUTROS('O');
	
	private char valorParantesco;

	private Parentesco(char valorParantesco) {
		this.valorParantesco = valorParantesco;
	}
	
	public char getValorParantesco() {
		return this.valorParantesco;
	}
}
