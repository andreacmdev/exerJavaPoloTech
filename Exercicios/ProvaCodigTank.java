package Exercicios;

public class ProvaCodigTank {

	public static void main(String[] args) {

		int[][] matriz = montarEPreencheQuadradoPerfeito();

		// output do quadrado
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" [ " + matriz[i][j] + " ]");
			}
			System.out.println();
		}
		// somando as linhas
		System.out.println();
		int somaLinhas = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somaLinhas += matriz[i][j];
				if (somaLinhas != somaLinhas) {
					System.out.println("quadrado invalido");
				}
			}
			System.out.println(" A soma da linha " + i + " é: " + (somaLinhas));
			somaLinhas = 0;
		}

		// somando as colunas
		System.out.println();
		int somaColunas = 0;
		int coluna;
		for (int i = 0; i < matriz.length; i++) {
			for (coluna = 0; coluna < matriz[i].length; coluna++) {
				somaColunas += matriz[coluna][i];

			}

			System.out.println("A Soma da coluna " + coluna + " é: " + (somaColunas));
			somaColunas = 0;
		}

		// somando diagonal 1
		System.out.println();
		int diagonal1 = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					diagonal1 = diagonal1 + matriz[i][j];
				}
			}
		}
		System.out.println("A Soma da diagonal 1 é " + (diagonal1));

		// somando diagonal 2
		int somaDiagonal2 = 0;
		int diagonal2 = matriz[0].length - 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				somaDiagonal2 += matriz[i][j];
				j--;
				if (j < 0) {
					break;
				}
			}
		}
		System.out.println("A soma da Diagonal 2 é: " + somaDiagonal2);
		System.out.println();

		// validando o quadrado
		System.out.println("Acompanhe o Output. Se todas as somas resultam no mesmo número, o quadrado é perfeito");

	}

	public static int[][] montarEPreencheQuadradoPerfeito() {
		int[][] matriz = { { 20, 6, 7, 17 }, { 9, 15, 14, 12 }, { 13, 11, 10, 16 }, { 8, 18, 19, 5 } };
		return matriz;
	}

}
