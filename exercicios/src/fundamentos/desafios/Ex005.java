package fundamentos.desafios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int valor = entrada.nextInt();
		
		int quadrado = (int)Math.pow(valor, 2);
		int cubo = (int)Math.pow(valor, 3);
		
		System.out.printf("%d? = %d", valor, quadrado);
		System.out.printf("\n%d? = %d", valor, cubo);
		
		entrada.close();
	}
}
