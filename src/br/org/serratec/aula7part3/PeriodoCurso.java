package br.org.serratec.aula7part3;

public enum PeriodoCurso {
    TARDE("Terça e Quinta", 40, 2500.),
    NOTURNO("Segunda e Quarta", 20, 1000.),
    INTEGRAL("Sexta", 80, 3200.);

    //Um construtor no enum ele é privado
    //Serve para organizar a ordem de inserção dos campos

    private String diasDaSemana;
    private Integer cargaHoraria;
    private Double valor;
    
    private PeriodoCurso(String diasDaSemana, Integer cargaHoraria, Double valor) {
        this.diasDaSemana = diasDaSemana;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }  
    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Double getValor() {
        return valor;
    }
}
