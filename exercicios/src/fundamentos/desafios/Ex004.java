package fundamentos.desafios;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		Scanner entrada	= new Scanner(System.in);
		
			System.out.println("Informe a base do Triangulo: ");
			double base  = entrada.nextDouble();
			
			System.out.println("Informe a altura do Triangulo:: ");
			double altura = entrada.nextDouble();
			
			double area = (base * altura) / 2;
			
			System.out.println("A area do tri?ngulo: "+ area + "cm?");
			
		entrada.close();
	}
}
