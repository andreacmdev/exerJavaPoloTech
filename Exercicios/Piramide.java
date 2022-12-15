package Exercicios;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Bem vindo. qual o tamanho do seu losango?");
		int coluna = scan.nextInt();

		int count;
		int k;

		for (count = coluna; count >= 1; count--) {
			for (k = 1; k < count; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (k = -count - 1; k >= count - coluna * 2 + 1; k--) {
				System.out.print(" ");
			}
			if (k == -count - 1) {
				System.out.println(" ");
			} else
				System.out.println("*");
		}
		for (count = 1; count <= coluna - 1; count++) {
			System.out.print(" ");
			for (k = 1; k < count; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (k = -count * 3; k >= -count - coluna * 2 + 4; k--) {
				System.out.print(" ");
			}
			if (k == -count * 3) {
				System.out.println(" ");
			} else
				System.out.println("*");

		}
	}
}