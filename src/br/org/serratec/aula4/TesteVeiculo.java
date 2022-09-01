package br.org.serratec.aula4;

public class TesteVeiculo {
    public static void main(String[] args) {
        Caminhao c =  new Caminhao("123", "KUL-4312", "Azul", 280000., 50000);
        c.calcularIPVA();

        System.out.println("Valor IPVA: " + c.getValorIPVA());
        System.out.println(c.toString());
        //getClass().getName() + '@' + Integer.toHexString(hashCode())
    }
}
