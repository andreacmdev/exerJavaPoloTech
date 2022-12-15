package Exercicios;
import java.util.Random;

public class ArrayInvertido {


	    public static void main(String[] args) {
	        int[] array = criarEPreencheArray();
	        imprimeConteudoArray(array);
	        int[] arrayInvertido = inverterArray(array);
	        imprimeConteudoArray(arrayInvertido);
	    }

	    public static int[] criarEPreencheArray() {
	        Random random = new Random();
	        return new int[] {
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100),
	                random.nextInt(0, 100)
	        };
	    }

	    public static void imprimeConteudoArray(int[] array) {
	        System.out.print("[");
	        for (int item : array) {
	            System.out.print(item + ", ");
	        }
	        System.out.println("]");
	    }

	    public static int[] inverterArray(int[] array) {
	        int[] arrayInvertido = new int[array.length];
	        int posicaoAtual = 0;
	        for (int indice = array.length - 1; indice >= 0; indice--) {
	            int numero = array[indice];
	            arrayInvertido[posicaoAtual] = numero;
	            posicaoAtual++;
	        }
	        return arrayInvertido;
	    }

	}