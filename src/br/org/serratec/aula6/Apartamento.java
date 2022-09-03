package br.org.serratec.aula6;

public class Apartamento extends Imovel{
    private Integer andar;
    
    public Apartamento(String local, Double valor, Integer andar) {
        super(local, valor);
        this.andar = andar;
    }

    public Integer getAndar() {
        return andar;
    }
    @Override
    public String toString() {
        return super.toString() + "\nAndar: " + andar;
    }
}  
