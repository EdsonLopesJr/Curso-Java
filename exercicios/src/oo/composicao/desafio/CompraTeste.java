package oo.composicao.desafio;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adcionarItem("Caneta", 9.67, 100);
		compra1.adcionarItem(new Produto("Notebook", 1987.88), 2);

		Compra compra2 = new Compra();
		compra2.adcionarItem("Caderno", 10.67, 10);
		compra2.adcionarItem(new Produto("Impressora", 987.88), 1);
		
		Cliente cliente = new Cliente("Edson Lopes");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		
		System.out.println(cliente.nome+"\n"+ cliente.obterValorTotal());
		
	}
}
