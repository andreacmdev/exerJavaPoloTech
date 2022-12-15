package Exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerArrayAmericanas {

	public static void main(String[] args) {
	    Scanner scan = new Scanner (System.in);
	    Random random = new Random();

	    System.out.println("Olá, informe o tamanho do array");
	    int tamanho = scan.nextInt();

	    int[] numeros = new int [tamanho];

	    for(int i = 0; i <numeros.length; i++) {
	        int valor = random.nextInt(0, 10);
	        numeros[i] = valor;
	        System.out.print("[" + numeros[i] + "]");
	    }

	    //Ordenando de forma crescente
	    Arrays.sort(numeros);
	    System.out.println();
	    System.out.println("Lista Ordenada");
	    for (int i = 0; i <numeros.length; i++) {
	        System.out.print("[" + numeros[i] + "]");
	    }
	}
	} 