package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String msgm = "";
		
		while(!msgm.equalsIgnoreCase("Sair")) {			
			System.out.println("Digite sair para finalizar o programa");
			System.out.println("\n");
			msgm = entrada.nextLine();
			
			
		}
		entrada.close();
	}
}
