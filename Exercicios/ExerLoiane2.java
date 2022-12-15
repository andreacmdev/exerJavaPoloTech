package Exercicios;

import java.util.Random;

public class ExerLoiane2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] vetorA = new int [5];
		int[] vetorB = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			int numero = random.nextInt(0, 10);
			vetorA[i] = numero;
			vetorB[i] = vetorA[i];
		}
		for (int i = 0; i<vetorA.length; i++) {
			System.out.print(" [ " + vetorA[i] + " ]");
		}
		System.out.println();
		for (int i = 0; i<vetorB.length; i++) {
			System.out.print(" [ " + vetorB[i] + " ]");
		}
		}
	}


