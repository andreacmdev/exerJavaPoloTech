package Exercicios;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bem vindo a Loja TUDO MAIS BARATO");
		
		System.out.println("Informe o tipo de roupa que voc� deseja: calca - bota - blusa - cachecol");
		String tipoRoupa = scan.next();
		
		System.out.println("O precoPadrao do produto");
		int precoPadrao = scan.nextInt();
		
		double desconto = 0;
		if (tipoRoupa.equalsIgnoreCase("calca")) {
			desconto = precoPadrao * 10 / 100;
		} else if (tipoRoupa.equalsIgnoreCase("bota")) {
			desconto = precoPadrao * 20 / 100;
		} else if (tipoRoupa.equalsIgnoreCase("blusa")){
			desconto = precoPadrao * 40 / 100;
		} else if  (tipoRoupa.equalsIgnoreCase("cachecol")) {
			desconto = precoPadrao * 40 / 100;
		} else {
			System.out.println("Produto inv�lido");
		}
		
		System.out.println("O pre�o final do produto: " + tipoRoupa + " �: " + (precoPadrao - desconto));
		
	scan.close();
	
	}
	

}
