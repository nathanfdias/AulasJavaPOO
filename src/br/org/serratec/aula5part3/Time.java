package br.org.serratec.aula5part3;

public class Time {
    private String nometime;
    private String nomeTreinador;
    private Atleta[] atletas;

    public Time(String nometime, String nomeTreinador, Atleta[] atletas) {
        this.nometime = nometime;
        this.nomeTreinador = nomeTreinador;
        this.atletas = atletas;
    }

    public String getNometime() {
        return nometime;
    }
    public String getNomeTreinador() {
        return nomeTreinador;
    }
    public Atleta[] getAtletas() {
        return atletas;
    }

    public void adicionarAtletas(Atleta atleta) {
        for(int i = 0 ; i < atletas.length ; i++) {
            if(atletas[i] == null) {
                atletas[i] = atleta;
                break;
            } 
        }
    }  
    
    public void listarAtletas() {
        for(int i = 0 ; i < atletas.length ; i++) { 
            System.out.println(atletas[i].getNomeAtleta());
        }
    }
}
