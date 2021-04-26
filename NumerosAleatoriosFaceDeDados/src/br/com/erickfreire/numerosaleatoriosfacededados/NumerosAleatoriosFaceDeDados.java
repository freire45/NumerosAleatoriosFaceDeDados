package br.com.erickfreire.numerosaleatoriosfacededados;

import java.security.SecureRandom;

/**
 * Programa em Java que sorteia numeros aleatórios de uma face de um dado de 1 a 6
 * @author Erick Freire
 * @version 1 Criado em 25-04-2021 as 23:42
 */

public class NumerosAleatoriosFaceDeDados {
	public static void main(String[] args) {
		SecureRandom numeroAleatorio = new SecureRandom();
		
		for(int i = 1; i <= 20; i++) {
			
			int face = 1 + numeroAleatorio.nextInt(6);
			
			System.out.printf("%d ", face);
			
			if(i % 5 == 0)
				System.out.println();
			
		}
	}

}
