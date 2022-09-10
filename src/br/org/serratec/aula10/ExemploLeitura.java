package br.org.serratec.aula10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeitura {
    public static void main(String[] args) {
        

        try {
            File arquivo = new File("/Exemplos/leitura.txt");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error ");
        }
        
    }
}
