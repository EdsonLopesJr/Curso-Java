package controle.desafios;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n = entrada.nextInt();
		
		if(n >= 0 && n <= 10 && n % 2 == 0) {
			
			System.out.println(n+" � um n�mero PAR e estar entre 0 e 10 ");
			
		} else if(n >= 0 && n <= 10 && n % 2 != 0) {
			
			System.out.println(n+ " � um n�mero IMPAR e estar entra 0 e 10");
			
		} else {
			
			System.out.println(n+ " n�o estar entre 0 e 10");
			
		}

		entrada.close();
	}
}
