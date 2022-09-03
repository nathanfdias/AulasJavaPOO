package br.org.serratec.aula5part3;

public class Teste {
    public static void main(String[] args) {
        
        Atleta atleta1 = new Atleta("Ganso", "Meia");
        Atleta atleta2 = new Atleta("Cano", "Centro-Avante");
        Atleta atleta3 = new Atleta("André", "Volante");
        Time time1 = new Time("Fluminense", "Diniz", new Atleta[3]);

        time1.adicionarAtletas(atleta1);
        time1.adicionarAtletas(atleta2);
        time1.adicionarAtletas(atleta3);

        System.out.println(time1.getNometime() + ":");
        time1.listarAtletas();
    }
}
