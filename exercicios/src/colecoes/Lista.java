package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
	
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Edson");
		lista.add(u1);
		lista.add(new Usuario("Flavia"));
		lista.add(new Usuario("Junior"));
		lista.add(new Usuario("Jennifer"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Flavia"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		System.out.println(">>>> "+ lista.remove(2));
		System.out.println(lista.remove(new Usuario("Ana")));
		System.out.println(lista.remove(new Usuario("Ana")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Flavia")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
	
}
