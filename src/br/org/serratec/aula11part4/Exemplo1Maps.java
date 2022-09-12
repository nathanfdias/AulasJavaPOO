package br.org.serratec.aula11part4;

import java.util.LinkedHashMap;
//import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;

public class Exemplo1Maps {
    public static void main(String[] args) {
        LinkedHashMap<String, String> estados = new LinkedHashMap<>();//Ordem inserção
        //TreeMap<String, String> estados = new TreeMap<>();Alfabetic Ordem
        //Map<String, String> estados = new HashMap<>();Aleatorio
        estados.put("AC", "Acre");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");

        System.out.println("\n-------Retorna a chave do Mapa-------");
        for (String sigla : estados.keySet()) {
            System.out.println(sigla);
        }

        System.out.println("\n-------Retorna os nomes do Mapa-------");
        for (String estadosNome : estados.values()) {
            System.out.println(estadosNome);
        }

        System.out.println("\n-------Retorna os valores do Mapa-------");
        for(Map.Entry<String, String> mapa : estados.entrySet()){
            System.out.println(mapa.getKey()+ "-" + mapa.getValue());
            //System.out.println(mapa); Outra demonstagem de ToString();
        }
    }
}
