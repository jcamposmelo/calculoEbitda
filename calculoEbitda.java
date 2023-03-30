public class Ebitda {
	public static void main(String[] args) {
		double receitasTotais = 1000000;
		double custosOperacionais = 500000;
		double ebitda = receitasTotais - custosOperacionais;
		double depreciacao = 900000;
		double amortizacao = 100000;
		
		ebitda = ebitda + depreciacao + amortizacao;
				
		System.out.println("O Ebitda calculado é: " + ebitda);
		 

	}

}