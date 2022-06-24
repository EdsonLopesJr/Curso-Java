package controle.desafios;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = entrada.nextInt();
		
		if(n >= 0 && n <= 10 && n % 2 == 0) {
			
			System.out.println(n+" é um número PAR e estar entre 0 e 10 ");
			
		} else if(n >= 0 && n <= 10 && n % 2 != 0) {
			
			System.out.println(n+ " é um número IMPAR e estar entra 0 e 10");
			
		} else {
			
			System.out.println(n+ " não estar entre 0 e 10");
			
		}

		entrada.close();
	}
}
