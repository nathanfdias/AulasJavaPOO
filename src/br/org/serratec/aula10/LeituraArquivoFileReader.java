package br.org.serratec.aula10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeituraArquivoFileReader {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileReader("/exemplos/leitura.txt"));
            while (sc.hasNext()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
