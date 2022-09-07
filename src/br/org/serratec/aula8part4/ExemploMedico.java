package br.org.serratec.aula8part4;

import java.util.ArrayList;
import java.util.List;

public class ExemploMedico {
    public static void main(String[] args) {
        List<Medico> medicos = new ArrayList<>();

        medicos.add(new Medico("321", "Sergio", 200.0));
        medicos.add(new Medico("636", "Carlota", 180.0));
        medicos.add(new Medico("685", "Matheus", 290.0));
        double maior = 0.0;
        String nome= "";

        for (Medico x : medicos) {
            System.out.println(x);

            if(x.getValorConsulta() > maior) {
                maior = x.getValorConsulta();
                nome = x.getNome();
            }
        }

        System.out.println("\nValor mais caro de consulta "+ "\nNome: " + nome+ "\nValor: "+ maior);
    }
}
