package fundamentos.desafios;

public class Ex006 {

	public static void main(String[] args) {
		
			double valorA = 1;
			double valorB = 12;
			double valorC = -13;
			
		double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
		
		double result1 = -valorB + Math.sqrt(delta) / 2 * valorA;
		double result2 = -valorB - Math.sqrt(delta) / 2 * valorA;
		
		System.out.println("O valor dos Resultados da  Bhaskara.\n"+ result1 +"\n" +  result2);
		
	}
}
