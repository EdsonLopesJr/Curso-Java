package controle.desafios;

import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o ano para verifcar se ? Bissexto: ");
		int ano = entrada.nextInt();

		if (ano % 4 == 0  && ano % 100 != 0 || ano % 400 == 0) {
			
			System.out.println("O ano "+ ano +" ? BISSEXTO");
		} else {
			System.out.println("O ano "+ ano +" n?o ? Bissexto");
		}
		
		entrada.close();
	}
}
