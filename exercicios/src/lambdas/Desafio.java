package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		
//		Produto p = new Produto("iPad", 3235.89, 0.13);
//	
////		 MINHA RESOLUÇÃO
//		System.out.printf("%s R$%.2f", p.nome, p.preco);
//		
//		UnaryOperator<Double> desconto = precoDesconto -> p.preco * (1 - p.desconto);
//		
//		Function<Double, Double> imposto = i -> p.preco >=
//				2500 ? desconto.apply(p.preco) * (1 + 0.085) 
//						: desconto.apply(p.preco); 
//		
//		Function<Double, Double> valorTotal = f -> p.preco >= 3000 ? imposto.apply(p.preco) + 100 : imposto.apply(p.preco) + 50;
//		
//		System.out.printf("\nValor Total: %.2f", valorTotal.apply(p.preco));
	
		
		
		Function<Produto, Double> desconto = d -> d.preco * (1 - d.desconto);
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("R$%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$"+ preco).replace(",", ".");
//		
//		
//		
//		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		String preco = desconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println(preco);
		
	}
}
