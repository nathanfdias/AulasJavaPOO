package br.org.serratec.exerciciospp2;

public class MiniCalculadora {
    public double calc(double x, double y, int oper){
        double result = 0;
        switch (oper) {
        case 1:
            result = x + y;
            break;
        case 2:
            result = x - y;
            break;
        case 3:
            result = x * y;
            break;
        case 4:
            result = x / y;
            break;
        default:
            break;
        }
        return result;
    }
}
