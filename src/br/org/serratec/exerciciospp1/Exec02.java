package br.org.serratec.exerciciospp1;

public class Exec02 {
    public static void main(String[] args) {

        Exec02Dados pessoa1= new Exec02Dados();
        pessoa1.nome = "Lucas";
        pessoa1.peso = 68.0;
        pessoa1.altura = 1.65;

        Exec02Dados pessoa2= new Exec02Dados();
        pessoa2.nome = "Mateus";
        pessoa2.peso = 72.0;
        pessoa2.altura = 1.77;

        Exec02Dados pessoa3= new Exec02Dados();
        pessoa3.nome = "Larissa";
        pessoa3.peso = 70.0;
        pessoa3.altura = 1.72;

        Exec02Dados pessoa4= new Exec02Dados();
        pessoa4.nome = "Marcos";
        pessoa4.peso = 88.0;
        pessoa4.altura = 1.85;
        
        double mediaPeso;
        double mediaAltura;

        mediaPeso = (pessoa1.peso + pessoa2.peso + pessoa3.peso + pessoa4.peso)/4;
        mediaAltura = (pessoa1.altura + pessoa2.altura + pessoa3.altura + pessoa4.altura)/4;

        System.out.println("Média peso: "+ mediaPeso);
        System.out.println("Média altura: "+ mediaAltura);

        double numPeso[] = {pessoa1.peso, pessoa2.peso, pessoa3.peso, pessoa4.peso};
        double numAltura[] = {pessoa1.altura, pessoa2.altura, pessoa3.altura, pessoa4.altura};
        String posNome [] = {pessoa1.nome, pessoa2.nome, pessoa3.nome, pessoa4.nome};
        String nomeMaiorPeso = "";
        String nomeMaiorAltura = "";
        double maxValue = 0.0;
        double maxValue2 = 0.0;

        for(int i = 0; i < 4; i++) {
            if(numPeso[i] > maxValue) {
                maxValue = numPeso[i];
                nomeMaiorPeso = posNome[i];
            }
            if(numAltura[i] > maxValue2) {
                maxValue2 = numAltura[i];
                nomeMaiorAltura = posNome[i];
            }
        }

        System.out.println("Maior Peso: " + nomeMaiorPeso);
        System.out.println("Maior Altura: " + nomeMaiorAltura);
    }
}