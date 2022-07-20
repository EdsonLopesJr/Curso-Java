package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		Function<Double, String> conceito = m -> m >= 6 ? "Aprovado!" : "Reprovado!";

		System.out.println(media.andThen(conceito).apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> situacao = (n1, n2) -> {
			double result = (n1 + n2) / 2; 			
			return result >= 6 ? "Aprovado" : "Reprovado"; 
		};
		
		System.out.println(situacao.apply(8.5, 7.2));
	}
}
