package br.org.serratec.aula8;

public class VetorEmpregado {
    public static void main(String[] args) {
        Empregado empregados[] = new Empregado[3];
        empregados[0] = new Empregado ("Marcos","123");
        empregados[1] = new Empregado ("Lucio","132");
        empregados[2] = new Empregado ("Neymar","412");
        
        for (Empregado listaEmpregados : empregados) {
            System.out.println(listaEmpregados);
        }
    }
}
