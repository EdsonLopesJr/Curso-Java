package controle.desafios;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		
		int primo = 0;
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe um n�mero: ");
		int n = entrada.nextInt();
		
		for(int i = 1;i <= n;i++) {
			if(n % i == 0) {
				primo++;
			}
		}
		if (primo == 2) {
			System.out.println(n+ " � PRIMO!");
		} else {
			System.out.println(n+ " n�o � primo!");
		}
			
		entrada.close();
    }
}