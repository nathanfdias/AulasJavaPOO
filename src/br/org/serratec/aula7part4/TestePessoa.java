package br.org.serratec.aula7part4;

public class TestePessoa {
    public static void main(String[] args) {
        Setor setor1 = new Setor(3, "Setor de Compras");
        Setor setor2 = new Setor(4, "Setor de Manutenção");

        Pessoa pessoa1 = new Pessoa("Marcus", "12344213", EstadoCivil.VIUVO, setor1);
        Pessoa pessoa2 = new Pessoa("Luiz", "41235213", EstadoCivil.CASADO, setor2);

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        System.out.print("\n");
        for(EstadoCivil situacao : EstadoCivil.values()) {
            System.out.println("Situações Previstas: " + situacao);
        }
    }
}
