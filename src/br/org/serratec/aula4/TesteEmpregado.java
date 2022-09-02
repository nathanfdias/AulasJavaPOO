package br.org.serratec.aula4;

// Caso estivesse em outra pasta a herança: package br.org.serratec.PASTA.Empregado
// Caso estivesse em outra pasta a herança: package br.org.serratec.PASTA.Tecnico

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("\nNathan", "nathanfaria9@gmail.com", 2500.00);
        Tecnico tecnico = new Tecnico("Kifel", "kifelgames@gmail.com", 5800.00);//Técnico é um empregado
        Programador programador = new Programador("Mark", "mark23@gmail.com", 10000.00, "Python");

        Empregado empregado = tecnico;
        empregado = programador; //Polimorfismo Pai para filho.
        
        
        System.out.println(empregado1.toString()+ "\n");
        System.out.println(tecnico.toString()+ "\n");      
        System.out.println(programador.toString()+ "\n");

        CalcularSalario cs = new CalcularSalario();
        cs.folhaPagamento(empregado);
        cs.folhaPagamento(tecnico);
        cs.folhaPagamento(programador);
    }
}
