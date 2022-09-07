package br.org.serratec.aula8part3;

public class ExemploVarArgs {
    public static void main(String[] args) {
        /*String a = "Qualquer Coisa";
        System.out.printf("%s", 9, "tete", "asdf", 909, true);
        System.out.printf("%s", a);
        varargs*/

        System.out.println(somarNumeros(100,10,20,30,40,100,200));    
    }

    public static int somarNumeros(int a,int...numeros) {
        int soma = 0;
        for (int valor : numeros) {
            soma += valor;
        }
        return soma;
    }
}
