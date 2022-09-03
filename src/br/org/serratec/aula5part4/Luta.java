package br.org.serratec.aula5part4;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private Boolean Confirmacao = false;

    public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.Confirmacao = confirmacao;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public Boolean getConfirmacao() {
        return Confirmacao;
    }

    public Boolean confirmacaoLuta() {
        //Para luta ser Confirmado: Necessário chegar:
        //1- Desafiante Diferente do Desafiado
        //2- Categoria iguais entre Lutadores
        if(!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())){ 
            return true;
        } 
        return false;
    }

}
