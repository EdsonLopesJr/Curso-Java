package controle.desafios;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a nota do aluno");
		System.out.print("Primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("m?dia = "+media);
		
		if(media >= 7.0) {
			
			System.out.println("Aluno(a) APROVADO!!");
			
		} else if(media < 7.0 && media > 4.0) {
			
			System.out.println("Aluno(a) em RECUPERA??O!");
			
		} else {
			
			System.out.println("Aluno(a) REPROVADO!");
			
		}

		entrada.close();
	}
}
