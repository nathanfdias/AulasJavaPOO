public class aula2part4 {
    public static void main(String[] args) {
        int i = 1;
        int f = 1;

        while (i <= 10 ) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------");

        do {
            System.out.println(f);
            f++;
        } while(f <= 10);

        System.out.println("--------------------------------");

        for (int h = 1 ; h <= 10; h++) {
            if (h <=  4 || h <= 10 && h >= 7) {
                System.out.println(h);
            }
        }

        /*Outra Forma Pular 5 e 6 no Contador
        for (int h = 1 ; h <= 10; h++) {
            if(h>=5 && h<=6) {
                continue;
            }
        }
         */
    }
}
