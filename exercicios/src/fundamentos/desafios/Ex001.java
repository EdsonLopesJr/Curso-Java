package fundamentos.desafios;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.printf("A convers?o entre %.1f?F para celsius ? %.1f?C", fahrenheit, celsius);
		entrada.close();
	}
}
