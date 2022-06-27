package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Edson");
		usuarios.put(2, "Jennifer");
		usuarios.put(3, "Junior");
		usuarios.put(4, "Flavia");

		System.out.println(usuarios.size());
//		usuarios.clear();
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsKey(1));
		System.out.println(usuarios.containsValue("Edson"));
		System.out.println(usuarios.containsValue("Ana"));

		System.out.println(usuarios.get(1));
		System.out.println(usuarios.remove(1));

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}

		for (String valor : usuarios.values()) {
			System.out.println(valor);
		}

		for (Entry<Integer, String> id : usuarios.entrySet()) {
			System.out.print(id.getKey() + " ");
			System.out.println(id.getValue());
		}

	}
}
