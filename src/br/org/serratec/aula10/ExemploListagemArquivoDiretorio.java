package br.org.serratec.aula10;

import java.io.File;
import java.util.Scanner;

public class ExemploListagemArquivoDiretorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo ou nome do diretório: ");
        String caminho = sc.next();

        File file = new File(caminho);

        if(file.exists()) {
            if(file.isFile()) {
                System.out.printf("\nArquivo (%s) existe - tamanho %d bytes ", file.getName(), file.length());
            } else {
                System.out.printf("\nArquivo (%s) existe - tamanho %d bytes ", file.getName(), file.length());
                String diretorio[] = file.list();
                for (String s : diretorio) {
                    System.out.printf("%s\n", s);
                }
            }
        } else {
            System.out.println("Arquivo ou diretório não encontrado!");
        }

        sc.close();
    }
}
