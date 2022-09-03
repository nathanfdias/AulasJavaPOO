package br.org.serratec.aula5part2;

public class TesteImovel {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcus", "marqueta32@gmail.com");
        Pessoa pessoa2 = new Pessoa("Lucio", "lucmarssalts@gmail.com");

        Imovel imovel1 = new Imovel("Casa", "Bairro Suiço", 500000., pessoa1);//Relacionando
        Imovel imovel2 = new Imovel("Apartamento", "Centro", 280000., pessoa2);//Relacionando

        System.out.println(imovel1.getLocal()+"-"+imovel1.getPessoa().getNome());//Primeiro Get da Pessoa definida e Depois o Nome
        System.out.println(imovel2.getLocal()+"-"+imovel2.getPessoa().getNome());
    }
}
