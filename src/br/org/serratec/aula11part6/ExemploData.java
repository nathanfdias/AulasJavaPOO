package br.org.serratec.aula11part6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploData {
    public static void main(String[] args) {
        Date dataAtual = new Date();//Importar de Java Util
        System.out.println(dataAtual);
        //System.out.println("Dia de hoje: " + dataAtual.getDate());// Não mais utilizado
        //System.out.println("Mês atual: " + dataAtual.getMonth());// Não mais utilizado
        //System.out.println("Ano atual: " + dataAtual.getYear());// Não mais utilizado

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//Formato a ser utilizado
        String dataForm = sdf.format(new Date());
        //OU String dataForm = sdf.format(dataAtual);   
        System.out.println(dataForm);
    }
}
