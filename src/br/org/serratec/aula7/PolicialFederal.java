package br.org.serratec.aula7;

public class PolicialFederal extends Policial{
    
    public PolicialFederal(String nome, String matricula, String lotacao) {
        super(nome, matricula);
        this.lotacao = lotacao;
    } // Após o usuário entrar com dado nunca mais será mudado Lotacao final

    private final String lotacao;// = "Brasília"; String Fixa

    public String getLotacao() {
        return lotacao;
    }
}
