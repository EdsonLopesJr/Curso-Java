package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int qtd_notas = 0;
		double nota = 0;
		double total = 0;
		
				
		System.out.println("Insira as notas ou digite -1 para sair");
		System.out.println("\n");
		System.out.println("Notas do aluno: ");
		
		while(nota != -1) {	
			nota = entrada.nextDouble();
				
			if(nota <= 10 && nota >= 0 ) {
				total += nota;
				qtd_notas++;
			} else if(nota != -1) {
				System.out.println("Valor �nvalido");
			}

		}
		
		
		double media = total / qtd_notas;
		System.out.println("A m�dia do aluno � "+ media);
		
		entrada.close();
		
		
	}
}
