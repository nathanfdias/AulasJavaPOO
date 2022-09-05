package br.org.serratec.exerciciospp6part2;

public class Atleta implements Olimpiadas{
    protected String nome;
    protected double peso;
    protected String modalidade;
    int totalParticipantes;
    
    protected String result; 

    public Atleta(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + "\nPeso: " + peso;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public String getModalidade() {
        return modalidade;
    }
    public int getTotalParticipantes() {
        return totalParticipantes;
    }
    
    public String getResult() {
        return result;
    }

    @Override
    public String verificaSituacao() {
        if (peso > 90 || peso > 60 && peso < 90) {
            return result =  "Participará";
            //return totalParticipantes = totalParticipantes + 1;
        } else {
            return result =  "Não Participará";
        }
    }

    @Override
    public int totalParticipantes() {
        if(result.equals("Participará")) {
            return 1;
        }
        return 0;
    }
}
