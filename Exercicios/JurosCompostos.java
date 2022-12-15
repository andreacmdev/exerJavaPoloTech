package Exercicios;

public class JurosCompostos {

	    public static void main(String[] args) {
	        final double JUROS_DIVIDA = 0.99;
	        final double JUROS_INVESTIMENTO = 1.3;

	        double valorDivida = 10000.0;
	        double valorInvestimento = 2398.00;

	        int quantidadeMeses = 0;

	        while (valorDivida >= valorInvestimento) {
	            quantidadeMeses += 1;
	            valorDivida = valorDivida + (valorDivida * JUROS_DIVIDA / 100);
	            valorInvestimento = valorInvestimento + (valorInvestimento * JUROS_INVESTIMENTO / 100);
	        }
	        System.out.println("Foram necessários " + quantidadeMeses + " meses para quitar a dívida");
	    }
	}

