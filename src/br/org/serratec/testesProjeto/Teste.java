package br.org.serratec.testesProjeto;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        Dependente d1 = new Dependente("Roberto", "12313435323", LocalDate.of(2019,1,1), Parentesco.FILHO);
        Dependente d2 = new Dependente("Juninho", "15453435323", LocalDate.of(2022,1,1), Parentesco.SOBRINHO);
        Funcionario pessoa1 = new Funcionario("Nathan", "12345678901", LocalDate.of(1989,1,1), 2000.00, new Dependente[2]);

        pessoa1.adicionarDependentes(d1); 
        pessoa1.adicionarDependentes(d2); 
        pessoa1.listarDependentes();


    }
}
