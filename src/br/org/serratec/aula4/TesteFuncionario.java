package br.org.serratec.aula4;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("123","Nathan",3000.0,"Gerente");
        Assistente assistente1 = new Assistente("321", "Lara", 1650.0,"Assistente");

        gerente1.aumentarSalarial();
        assistente1.aumentarSalarial();

        System.out.println("Dados: " + gerente1.getNome()+ "\n"+ gerente1.getSalario() + "\n"+ gerente1.getTipo());
        System.out.println("Dados: " + assistente1.getNome()+ "\n"+ assistente1.getSalario() + "\n"+ assistente1.getTipo());
    }
}
