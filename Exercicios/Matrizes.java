package Exercicios;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		
		int [][] matrizRandom = new int[3][3];
		
		matrizRandom [0] = new int [3];
		matrizRandom [0][0] = random.nextInt(0,10);
		matrizRandom [0][1] = random.nextInt(0,10);
		matrizRandom [0][2] = random.nextInt(0,10);

		
		matrizRandom [1] = new int [3];
		matrizRandom [1][0] = random.nextInt(0,10);
		matrizRandom [1][1] = random.nextInt(0,10);
		matrizRandom [1][2] = random.nextInt(0,10);

		
		matrizRandom [2] = new int [3];
		matrizRandom [2][0] = random.nextInt(0,10);
		matrizRandom [2][1] = random.nextInt(0,10);
		matrizRandom [2][2] = random.nextInt(0,10);
		
		imprimirMatriz(matrizRandom);

	}

	public static void imprimirMatriz(int[][] matriz) {
        //matriz.length me entrega quantas linhas eu tenho
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                System.out.print("[" + valorLinhaColuna + "]");
            }
        }
	}
                
public static void preencheMatriz(int[][] matriz) {
        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 1000);
            }
        }
	}
}
