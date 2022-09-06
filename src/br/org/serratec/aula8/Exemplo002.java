package br.org.serratec.aula8;

public class Exemplo002 {
    public static void main(String[] args) {
        String pessoas[][] = //new String[][] Forma implícita
                                            {{"Marcos", "m@gmail.com"},
                                            {"Ana", "a@gmail.com"},
                                            {"Carla", "c@gmail.com"},
                                            {"Bruno", "b@gmail.com"},};

        for(int linha = 0; linha < pessoas.length ; linha++){
            for(int coluna = 0; coluna < pessoas[linha].length; coluna++){
                System.out.println(pessoas[linha][coluna]);
            }
        }
    }
}
