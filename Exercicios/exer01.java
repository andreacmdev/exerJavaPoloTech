package Exercicios;

import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bem vindo a Loja TUDO MAIS BARATO");
		
		System.out.println("Informe o tipo de roupa que você deseja: calca - bota - blusa - cachecol");
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
			System.out.println("Produto inválido");
		}
		
		System.out.println("O preço final do produto: " + tipoRoupa + " é: " + (precoPadrao - desconto));
		
	scan.close();
	
	}
	

}
