package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();

		System.out.print("Quantas notas do aluno? ");
		int qtdNotas = entrada.nextInt();

		double[][] notasTurma = new double[qtdAlunos][qtdNotas];

		double total = 0;

		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma[a].length; n++) {

				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}

		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("M�dia da turma � " + media);

		for (double[] notasAlunos : notasTurma) {
			System.out.println(Arrays.toString(notasAlunos));
		}

		entrada.close();
	}
}
