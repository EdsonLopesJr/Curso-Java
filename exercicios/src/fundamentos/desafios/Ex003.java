package fundamentos.desafios;

import java.util.Scanner;


public class Ex003 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a sua altura: ");
		String alturaString = entrada.nextLine().replace(",", ".");
	
		System.out.print("Informe a sua peso: ");
		String pesoString = entrada.nextLine().replace(",", ".");
		
		double altura = Double.parseDouble(alturaString);
		double peso = Double.parseDouble(pesoString);
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("Seu IMC é Igual a "+ imc);
		
		entrada.close();
	}
}
