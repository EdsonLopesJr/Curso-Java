package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
//		p1.nome = "Notebook";
//		p1.preco = 4356.89;
//		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome+ " R$"+ p1.preco);
		System.out.println(p2.nome + " R$"+ p2.preco);
		
	
		System.out.printf("R$%.2f\n", p1.precoComDesconto());
		System.out.printf("R$%.2f\n", p2.precoComDesconto());
		
		double mediaPrecos = (p1.precoComDesconto() + p2.precoComDesconto()) / 2;
		
		System.out.printf("M?dia dos pre?os = R$%.2f", mediaPrecos);
		
	
	}
}
