public class classeAluno2 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        //Intãncia de um objeto

        classeAluno aluno1 = new classeAluno();
        aluno1.matricula = 321;
        aluno1.nome = "Carlão";
        aluno1.email = "carlitotevez@gmail.com";

        System.out.println(aluno1.matricula + " " + aluno1.nome + " " + aluno1.email);

        classeAluno aluno2 = new classeAluno();
        classeAluno aluno3 = aluno2;

        System.out.println("Aluno 1:"+ aluno1);
        System.out.println("Aluno 2:"+ aluno2);

        if(aluno3==aluno2){
            System.out.println("Objetos Iguais entre Aluno 3 e Aluno 2");
        }else {
            System.out.println("Objetos Diferentes entre Aluno 3 e Aluno 2");
        }
    }
}
