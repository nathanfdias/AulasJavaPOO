public class aula2part5 {
    public static void main(String[] args) {
        String[]vetor = {"Ana","Matheus","Marcola","Lara"};

        /*for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        
        Usando For each */

        for (String nome : vetor) {
            System.out.println(nome);    
        }
    }
}
