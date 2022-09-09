package br.org.serratec.aula9;

public class CalculoMedia {
//Throw - lançar uma execption.
    /*public static int calcular(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("Valores Inválidos: Error (0)!");
        } 
        return num1/num2;
    }*/

    //throws - O erro não será tratado no método, e sim na classe que chamar o método
    public static int calcular(int num1, int num2) throws ArithmeticException{
        return num1/num2;
    }
}
