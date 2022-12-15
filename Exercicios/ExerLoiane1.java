package Exercicios;

import java.util.Iterator;

public class ExerLoiane1 {

	public static void main(String[] args) {
		int[] temperaturas = new int [5];
		
			temperaturas [0] = 31;
			temperaturas [1] = 33;
			temperaturas [2] = 28;
			temperaturas [3] = 30;
			temperaturas [4] = 22;
		
			int soma = 0;
			for (int i = 0; i < temperaturas.length; i++) {
				System.out.print("[" + temperaturas[i] + "]");								
			}
			System.out.println();
			for (int i = 0; i < temperaturas.length; i++) {
				soma = soma + temperaturas[i];
			}
			System.out.println(soma);
			
			double mediaTemperatura = soma / temperaturas.length;
			System.out.println(mediaTemperatura);
	}

}
