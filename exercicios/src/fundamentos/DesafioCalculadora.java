package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = entrada.nextInt();
		
		System.out.print("Informe o segundo número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("Escolha o tipo da operação:");
		System.out.println("+ Soma\n- Subtração\n* Multiplicação\n/ Divisão\n% Modulo\n");
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
