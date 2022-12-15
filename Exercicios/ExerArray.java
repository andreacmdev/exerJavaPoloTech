package Exercicios;

import java.util.Random;

public class ExerArray {

	public static void main(String[] args) {

		Random random = new Random();
		int[] numeros = { random.nextInt(0, 100), random.nextInt(0, 100), random.nextInt(0, 100),
				random.nextInt(0, 100), random.nextInt(0, 100), random.nextInt(0, 100), random.nextInt(0, 100),
				random.nextInt(0, 100), random.nextInt(0, 100), random.nextInt(0, 100) };

		int maiorNumeroConhecido = -1;
		int menorNumeroConhecido = 101;
		int soma = 0;
		for (int indice = 0; indice < numeros.length; indice++) {
			int numeroAtual = numeros[indice];
			if (numeroAtual > maiorNumeroConhecido) {
				maiorNumeroConhecido = numeroAtual;
			}
			if (numeroAtual < menorNumeroConhecido) {
				menorNumeroConhecido = numeroAtual;
			}
			// soma = soma + numeroAtual;
			soma += numeroAtual;
		}
		double mediaSimples = (double) soma / numeros.length;
		System.out.println("O maior número dentro do array é: " + maiorNumeroConhecido + " e o menor é: "
				+ menorNumeroConhecido + " e a média de valores é: " + mediaSimples);
	}

}
