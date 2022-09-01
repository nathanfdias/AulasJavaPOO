package br.org.serratec.aula3;

public class TesteMedico {
    public static void main(String[] args) {
        Medico medico1 = new Medico(123, "Carlos", 9000., 300.);
        Medico medico2 = new Medico(321, "Carol", 9000., 300.);

        medico1.pagamentoDinheiro();
        medico2.pagamentoPlanoDeSaude();

        System.out.println("Total de Médicos: "+ Medico.getContador());
    }
}
