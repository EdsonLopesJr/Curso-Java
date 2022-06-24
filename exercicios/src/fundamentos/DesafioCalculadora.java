package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Escolha o tipo da opera��o:");
		System.out.println("+ Soma\n- Subtra��o\n* Multiplica��o\n/ Divis�o\n% Modulo\n");
		String op = entrada.next();
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? (double) num1 / num2 : resultado;
		resultado = "%".equals(op) ? (double) num1 % num2 : resultado;
		
		System.out.println(num1 + " + " + num2 + " = " + resultado);
		
		entrada.close();
	}
}
