package br.org.serratec.aula11;

public class TesteGenerico {
    public static void main(String[] args) {
        MeuGenerico<String> mg1 = new MeuGenerico<String>("Hello !");
        MeuGenerico<Integer> mg2 = new MeuGenerico<Integer>(1000);
        MeuGenerico<Funcionario> mg3 = new MeuGenerico<Funcionario>(new Funcionario("Mark", "markitro.gmail.com", 2600.));

        System.out.println(mg1);
        System.out.println(mg2);
        System.out.println(mg3);

        MeuGenerico<? super Funcionario> mg4 = new MeuGenerico<Funcionario>(new Diretor("Marcola", "mark4h20.gmail.com", 9000. , "CIO"));

        System.out.println(mg4);
    }
}
