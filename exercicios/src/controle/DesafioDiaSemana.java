package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um dia da Semana: ");
		String dia = entrada.next();
		
		if("domingo".contentEquals(dia)) {
			System.out.println("1");
		} else if("segunda".contentEquals(dia)) {
			System.out.println("2");
		} else if("terça".contentEquals(dia)) {
			System.out.println("3");
		} else if("quarta".contentEquals(dia)) {
			System.out.println("4");
		} else if("quinta".contentEquals(dia)) {
			System.out.println("5");
		} else if("sexta".contentEquals(dia)) {
			System.out.println("6");
		} else if("sábado".contentEquals(dia)) {
			System.out.println("7");
		}
		
		System.out.println("FIM!");
		entrada.close();
	}
}
