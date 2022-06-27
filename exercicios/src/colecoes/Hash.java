package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<>();

		usuarios.add(new Usuario("Edson"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Junior"));
		usuarios.add(new Usuario("Jennifer"));
		usuarios.add(new Usuario("Jade"));

		boolean resultado = usuarios.contains(new Usuario("Edson"));
		System.out.println(resultado);
	}
}
