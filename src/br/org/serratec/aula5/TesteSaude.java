package br.org.serratec.aula5;

public class TesteSaude {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("DoctorCare", "Checkout", "213H53F3");
        Medico medico = new Medico("Unimed", 3458, "Madalena");
        Anestesista anestesista = new Anestesista("QuimioDoc", 4571, "Mauricio", "Geral");
        ControlePagamento cp = new ControlePagamento();

        clinica.calcularPagamento();
        cp.calcularTotalPago(clinica);

        medico.calcularPagamento();
        cp.calcularTotalPago(medico);
        
        anestesista.calcularPagamento();
        cp.calcularTotalPago(medico);

        System.out.println(clinica + "\nValor a Receber do Plano: " + clinica.getValorPago());
        System.out.println(medico + "\nValor a Receber do Plano: " + medico.getValorPago());
        System.out.println(anestesista + "\nValor a Receber do Plano: " + anestesista.getValorPago());

        System.out.println("Total Geral Pago: " + cp.getTotalGeral());
    } 
}
