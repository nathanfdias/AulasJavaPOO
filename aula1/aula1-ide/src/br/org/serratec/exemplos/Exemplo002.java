package br.org.serratec.exemplos;

import java.time.LocalDate;
import java.util.List;

public class Exemplo002 {

	public static void main(String[] args) {
		//ALT + SHIFT + R - ALTERAR VARIAS VARIAVEIS JUNTO
		//CNTRL + SHIFT + O - Import Pack
		int valor = 100;
		valor = 300;
		List Alunos;
		
		LocalDate data = LocalDate.now();
		System.out.println("Hoje é dia: " + data);
		System.out.println(valor);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
	}

}
