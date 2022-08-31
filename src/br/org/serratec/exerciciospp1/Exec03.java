package br.org.serratec.exerciciospp1;

public class Exec03 {
    public static void main(String[] args) {
        int fat;
        for (int i = 1; i < 10; i++) {
            int n = i;
            for (fat = 1 ; n > 1; n--) {
                fat = fat * n;
            }
            System.out.println("Fatorial: " + i + " = " + fat);
        }
    }
}
