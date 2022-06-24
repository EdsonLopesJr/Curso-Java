package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		
		
		double media = 7.6;
		String resultadoReprovado = media <= 5.0 ? "reprovado!".toUpperCase() : "em recuperação.";
		String resultado = media >= 7.0 ?
				"Aprovado!".toUpperCase() : resultadoReprovado;
		
		System.out.println("O aluno está " + resultado);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String result = temDesconto ? "SIM!" : "NÃO!";
		
		System.out.println("\n****************************");
		System.out.println("TEM DESCONTO??  " + result);
	}
}
