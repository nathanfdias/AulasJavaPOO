package br.org.serratec.treino;

import java.util.Scanner;

public class Conversor { //Conversor Celsius Fahrenheit
    public static void main(String[] args) {
        
      // A try-with-resources statement.
        try (Scanner sc = new Scanner(System.in)) {
            // Asking the user to input a temperature in Celsius and then converting it to Fahrenheit.
            System.out.println("Digite a temperatura em Celsius:");
            Double numCelsius = sc.nextDouble();
            // Converting the temperature from Celsius to Fahrenheit.
            Double  numFahrenh = (numCelsius * 1.8) + 32;
            System.out.println("Temperatura em Fahrenheit: "+ numFahrenh + "º");
        }             
    }
}
