package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class ExerMatriz {
	public static void main(String[] args) {

		int tamanho = obterTamanho();
		int[][] quadrado = gerarMatrizQuadrada(tamanho);
		imprimirMatriz(quadrado);
		int[] somaLinhas = somatorioPorLinha(quadrado);
		//int[] somaColuna = somatorioPorColuna(quadrado);
		//int maiorLinha = encontrarLinhaComMaiorSomatoria(somaLinhas);
		//int maiorColuna = encontrarColunaComMaiorSomatoria(somaColuna);

		//System.out.println("A linha com maior soma é a linha número " + maiorLinha);

		//System.out.println("A linha com maior soma é a linha número " + maiorColuna);

	}

	public static int obterTamanho() {
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o tamanho da matriz quadrada");
		int tamanho = scan.nextInt();
		return tamanho;

	}

	private static int[][] gerarMatrizQuadrada(int tamanho) {
		int[][] matrizQuadrada = new int[tamanho][tamanho];
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				matrizQuadrada[i][j] = new Random().nextInt(0 , 100);
			}
		}
		return matrizQuadrada;
	}

	public static void imprimirMatriz(int[][] matriz) {
		// matriz.length me entrega quantas linhas eu tenho
		for (int linha = 0; linha < matriz.length; linha++) {
			int[] valorLinha = matriz[linha];
			// valorLinha.length me entrega a quantidade de valorLinha dentro da linha
			for (int coluna = 0; coluna < valorLinha.length; coluna++) {
				int valorLinhaColuna = valorLinha[coluna];
				System.out.print("[" + valorLinhaColuna + "]");	
				
					}
			}
		}

	public static int[] somatorioPorLinha(int[][] matriz) {

		int[] somaLinhas = new int[matriz.length];

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				somaLinhas[linha] += matriz[linha][coluna];
			}
		}

		return somaLinhas;
	}

	public static int[] somatorioPorColuna(int[][] matriz) {

		int[] somaColunas = new int[matriz[0].length];
		for (int i = 0; i < matriz.length; i++) {
			int somaColuna = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				somaColuna += matriz[j][i];
			}
			somaColunas[i] = somaColuna;
		}
		return somaColunas;
	}

	public static int encontrarLinhaComMaiorSomatoria(int[] array) {
		int maiorValor = 0;
		int linha = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maiorValor) {
				maiorValor = array[i];
				linha = i;
			}
		}

		return linha;
	}
	
	public static int encontrarColunaComMaiorSomatoria (int[] array) {
		int maiorValor = 0;
		int coluna = 0;
		for (int i=0; i<array.length; i++) {
			for (int j = 0; j < array[i]; i++) {
				if (array[j] > maiorValor) {
					maiorValor = array[j];
					coluna = 1;
			}

			}
		}
		return coluna;
	}

	public static int encontrarPosicaoMaiorValorArray(int[] array) {
		int maiorValor = 0;
		int linha = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maiorValor) {
				maiorValor = array[i];
				linha = i;
			}
		}

		return linha;
	}

}