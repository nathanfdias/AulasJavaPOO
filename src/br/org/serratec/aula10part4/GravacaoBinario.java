package br.org.serratec.aula10part4;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class GravacaoBinario {
    public static void main(String[] args) {
        try {
            FileOutputStream gravar = new FileOutputStream("/exemplos/teste.bin");
            DataOutputStream gravarArquivo = new DataOutputStream(gravar);
            gravarArquivo.writeChars("Java POO");
            gravarArquivo.close();

        } catch (Exception e) {
            System.out.println("Error: Gravação do Arquivo.");
        }
    }
}
