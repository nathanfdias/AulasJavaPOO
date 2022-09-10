package br.org.serratec.aula10part2;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ExemploEmpregadosArquivos {
    public static void main(String[] args) {

        File arquivo = new File("/exemplos/empregados.txt");
        
        try {
            Scanner sc = new Scanner(arquivo);
            Set <Empregado> empregados = new HashSet<>();
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                if (!linha.isEmpty()) {
                    String vetor[] = linha.split(";");
                    empregados.add(new Empregado(vetor[0], vetor[1]));
                }
            }
            sc.close();

            System.out.println("---------- Dados do Arquivo ----------");

            for (Empregado empregado : empregados) {
                System.out.println(empregado);
            }

            System.out.println("---------- Gravação do Arquivo ----------");
            FileWriter arquivoGravar = new FileWriter("/exemplos/empregos.txt");
            PrintWriter gravacaoArquivo = new PrintWriter(arquivoGravar);

            for (Empregado empregado : empregados) {
                String linha = empregado.getCpf()+ ";"+ empregado.getNome()+ "\n";
                gravacaoArquivo.print(linha);
            }
            System.out.println("Arquivo Gravado com sucesso!");
            gravacaoArquivo.close();

        } catch (IOException e) {
            System.out.println("Não funcionou");
            e.printStackTrace();
        }
    }
}
