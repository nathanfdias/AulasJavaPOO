package br.org.serratec.exerciciospp5;

public class Teste {
    public static void main(String[] args) {
        Telefone tel1 = new Telefone("22981624053");
        Telefone tel2 = new Telefone("25215324");
        Cidade cidade1 = new Cidade("Nova Friburgo");
        Estado estado1 = new Estado("Rio de Janeiro");
        Endereco endereco1 = new Endereco("Rua Tulio", "Marcola", "38741-23", cidade1, estado1);
        Contato pessoa1 = new Contato("Nathan", new Telefone[2], endereco1);
    
        pessoa1.adicionarTelefones(tel1);
        pessoa1.adicionarTelefones(tel2);

        System.out.println(pessoa1.getNome() + ":");
        System.out.println(endereco1.toString());
        pessoa1.listarTelefones();
    }
}
