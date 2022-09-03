package br.org.serratec.aula6part2;

public class Teste {
    public static void main(String[] args) {
        Assistente assistente1 = new Assistente("19020071742", "Ryan", 2500.,100.);
        Gerente gerente1 = new Gerente("34021156278", "Roger", 5500., "Financeiro");
        Diretor diretor = new Diretor("23445536361", "John", 10000., "CIO");

        assistente1.aumentarSalario();
        gerente1.aumentarSalario();
        diretor.aumentarSalario();

        System.out.println(assistente1);
        System.out.println(gerente1);
        System.out.println(diretor);
    }
}
