package br.org.serratec.aula11part5;

import java.util.HashMap;
import java.util.Map;

public class TesteVeiculoMap {
    public static void main(String[] args) {
        Map<String, String> veiculo = new HashMap<String, String>();

        veiculo.put("Ford", "Fusion");
        veiculo.put("Toyota", "Hillux");
        veiculo.put("Honda", "Civic");
        veiculo.put("Volkswagem", "Voyage");
        veiculo.put("Fiat", "Uno");
        
        for(Map.Entry<String, String> carros : veiculo.entrySet()){
            System.out.println(carros);
        }
    }
}
