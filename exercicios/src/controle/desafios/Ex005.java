package controle.desafios;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {

		int primo = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um n�mero: ");
		int n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				primo++;
			}
		}
		
		switch (primo) {

		case 2:
			System.out.println("O numero " + n + " � um numero primo.");
			break;

		default:
			System.out.println("O numero " + n + "  n�o � um numero primo.");

		}
		entrada.close();
	}
}
