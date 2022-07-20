package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresNumero = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresNumero).negate().test(123));
		System.out.println(isPar.or(isTresNumero).test(123));
	}
}
