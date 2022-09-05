package br.org.serratec.aula7part4;

public enum EstadoCivil {
    SOLTEIRO('S'),
    CASADO('C'),
    VIUVO('V'),
    DIVORCIADO('D');

    private char situacao;

    private EstadoCivil(char situacao) {
        this.situacao = situacao;
    }
    
    public char getSituacao() {
        return situacao;
    }
}
