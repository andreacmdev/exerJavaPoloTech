package Exercicios;

import java.util.Random;

public class ExerLoiane4 {

	public static void main(String[] args) {
		Random random = new Random();

		double [][] notasAlunos = new double [4][4];
		
		//preenchendo matriz com random
		for (int i = 0; i < notasAlunos.length; i++) {
				for (int j = 0; j < notasAlunos[i].length; j++){
					notasAlunos[i][j] = random.nextInt(0 , 10);					
				}		
		}
		//output Matriz
		for (int i = 0; i<notasAlunos.length; i++) {
			for (int j = 0; j<notasAlunos[i].length; j++) {
			System.out.print(" [ " + notasAlunos[i][j] + " ]");
		}
			System.out.println();
		}
	}
}


