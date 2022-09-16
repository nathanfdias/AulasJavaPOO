package br.org.serratec.aula14part4;

import java.util.Arrays;
import java.util.List;

public class Exemplo3String {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10,100,200,400,900,1200,40);

        //Imprimir lista com incremento de 10 para todos os valores;
        numeros.stream().map(t->t + 10).forEach(t-> System.out.println(t));

        System.out.println("----------------");

        numeros.stream().map(t-> t -5).forEach(t-> System.out.println(t));//Não atualiza;

        //System.out.println("----------------");

        //List<String> numeros2 = Arrays.asList("30","500","180","100","200","80");
        //numeros2.stream().map(n-> new Double(n)).forEach(n -> System.out.println(n));
        //Não mais usado, porén transforma!String para Double;
        
        System.out.println("----------------");

        numeros.stream().skip(2).forEach(t-> System.out.println(t));//Pula os 2 primeiros;

        System.out.println("----------------");

        numeros.stream().limit(3).forEach(t-> System.out.println(t));//Limita tamanho;

        //Select distinct * from nomeDaTabela
        System.out.println("----------------");

        numeros.stream().distinct().forEach(n-> System.out.println(n));//Ignora Repetidos;

        System.out.println("----------------");

        numeros.stream().sorted().forEach(n-> System.out.println(n));//Ordena;

        System.out.println("----------------");

        numeros.stream().distinct().sorted().forEach(n-> System.out.println(n));//Ordena e não repete;

        
    }
}
