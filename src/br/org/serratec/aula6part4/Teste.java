package br.org.serratec.aula6part4;

public class Teste {
    public static void main(String[] args) {
        Empresa e = new Empresa("ABC",259000.);
		Pessoa p = new Pessoa("Marcos", 82000.);
		TotalImpostos ti = new TotalImpostos();
		
		System.out.println(e + "\nTributos a pagar \nICMS :" 
							+ e.calcularICMS()+ " \nIR: " +e.calcularImpostoDeRenda());
		System.out.println(p + "\nTributos a pagar \nIR: " + p.calcularImpostoDeRenda());

		ti.totalGeralTributos(p);
		ti.totalGeralTributos(e);

		System.out.println("\nTotalização de Tributos: \n" + ti.getTotal());
    }
}
