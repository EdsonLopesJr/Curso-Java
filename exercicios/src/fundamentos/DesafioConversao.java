package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu primeiro salário : ");
		String valor1 = input.nextLine().replace(",", ".");
		
		System.out.print("Informe o seu segundo salário : ");
		String valor2 = input.nextLine().replace(",", ".");
		
		System.out.print("Informe o seu terceiro salário : ");
		String valor3 = input.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("Soma dos salário é " + soma);
		System.out.println("média dos salário é " + soma /  3);
		
		input.close();
	}
}
