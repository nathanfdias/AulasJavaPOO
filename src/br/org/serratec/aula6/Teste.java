package br.org.serratec.aula6;

public class Teste {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("Roni");
        Proprietario proprietario2 = new Proprietario("Mara");
        Casa casa1 = new Casa("Centro", 500000., true);
        Apartamento apartamento2 = new Apartamento("Bairro X", 280000., 4);
        casa1.setProprietario(proprietario1);
        apartamento2.setProprietario(proprietario2);

        System.out.println("\nDados Imóvel: " + casa1 +"\n" + casa1.getProprietario().getNome());
        System.out.println("\nDados Imóvel: " + apartamento2 +"\n" + apartamento2.getProprietario().getNome());
    }
}
