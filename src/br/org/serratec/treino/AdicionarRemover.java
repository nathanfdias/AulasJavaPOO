package br.org.serratec.treino;

public class AdicionarRemover {

    public double calc(double x,int operacao ){
        double result = 0;

        switch (operacao) {
            case 1:
                result = x + 10;
                break;
            case 2:
                result = x - 10;
                break;
            default:
                break;
        }
        return result;      
    } 
}
