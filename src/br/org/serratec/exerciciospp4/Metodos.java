package br.org.serratec.exerciciospp4;

import java.util.Scanner;
public class Metodos {
    Fixo vendedor1 = new Fixo("Joana", "190.200.763-24", 1300.0, 0.05, 0.);
    Fixo vendedor2 = new Fixo("Maria", "334.214.793-41",1300.0, 0.03, 0.);

    public void fecharPrograma() {
        System.out.println("\nDeseja fechar o programa: \n1 - Sim \n2 - Não");
        Scanner sc = new Scanner(System.in);
        int decisao = sc.nextInt();

        if (decisao == 1) {
            exibirRelatorio();
        } else if(decisao == 2) {
            escolherVendedor();
        } else {
            System.out.println("\nValor Inesperado!");
            fecharPrograma();
        }
        sc.close();
    }

    public void exibirRelatorio() {
        System.out.println("\nNome: " + vendedor1.getNome()+ "\nSalário Bruto: " + vendedor1.getSalarioBruto());
        System.out.println("\nNome: " + vendedor2.getNome()+ "\nSalário Bruto: " + vendedor2.getSalarioBruto());
    }

    public void escolherVendedor() {
        double x, y;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEscolha o vendedor:");
        System.out.println("1 -"+ vendedor1.getNome());
        System.out.println("2 -"+ vendedor2.getNome());
        int a = sc.nextInt();
        
        switch(a) {
            case 1:
                System.out.println("\nDigite o valor da venda: \n");
                x = sc.nextDouble();
                vendedor1.setValorVenda(x);
                vendedor1.calcularSalario();
                //vendedor1.getSalarioBruto();
                fecharPrograma(); 
            break;
            case 2:
                System.out.println("\nDigite o valor da venda: \n");
                y = sc.nextDouble();
                vendedor2.setValorVenda(y);
                //vendedor2.getSalarioBruto();
                fecharPrograma(); 
            break;
            default:
                System.out.println("\nValor Indefinido.");
            break;
        }
        
        sc.close();
    }  
}
