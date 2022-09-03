package br.org.serratec.aula5part4;

public class TesteLuta {
    public static void main(String[] args) {
        Categoria categoria1 = new Categoria("PESO PESADO");
        Categoria categoria2 = new Categoria("PESO LEVE");

        Lutador lutador1 = new Lutador("Cigano", 95.,30, categoria1);
        Lutador lutador2 = new Lutador("Anderson", 98.,35, categoria1);
        Lutador lutador3 = new Lutador("Fulano", 65.,40, categoria2);
        Lutador lutador4 = new Lutador("Mike", 67.,23, categoria2);

        Luta luta1 = new Luta(lutador1, lutador2, false);
        Luta luta2 = new Luta(lutador3, lutador2,false);
        Luta luta3 = new Luta(lutador4, lutador3,false);

        luta1.confirmacaoLuta();
        luta2.confirmacaoLuta();
        luta3.confirmacaoLuta();
        System.out.println((luta1.getConfirmacao()) ? "Confirmado" : "Não Confirmado");
        System.out.println((luta2.getConfirmacao()) ? "Confirmado" : "Não Confirmado");
        System.out.println((luta3.getConfirmacao()) ? "Confirmado" : "Não Confirmado");
    }
}
