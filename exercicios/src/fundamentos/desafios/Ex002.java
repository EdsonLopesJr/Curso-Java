package fundamentos.desafios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("A conversão entre %.1f°C para fahrenheit é %.1f°F", celsius, fahrenheit);
		
		entrada.close();
	}
}
