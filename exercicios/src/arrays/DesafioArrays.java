package arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas você gostaria de informar ? ");
		int qtdNotas = entrada.nextInt();
		double[] notasAluno = new double[qtdNotas];
			
		for(int i = 0;i < notasAluno.length; i++) {
			System.out.print("Digite a "+ (i+1) + "ª nota: ");
			notasAluno[i] = entrada.nextDouble();			
		}
		
		double total = 0;
		for (double nota : notasAluno) {
			total += nota;
		}
		
		System.out.println(total / notasAluno.length);
		entrada.close();
	}
}
