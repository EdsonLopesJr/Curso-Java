package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add --> Adicionam elementos na fila

		// Diferença é o comportamento ocorre quando a fila está cheia!

		fila.add("Ana"); // retorna false
		fila.offer("Junior"); // Lança uma exceção
		fila.add("Edson");
		fila.offer("Jennifer");
		fila.add("Flavia");
		fila.offer("Jade");

		// Peek e Element --> Obter o próximo elementos da fila(sem remover)

		// Diferença é o comportamento ocorre quando a fila está vazia!

		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lanã uma exceção
		System.out.println(fila.element());

		// Poll e Remove --> Obter o próximo elementos da fila e remove!
		// Diferença é o comportamento ocorre quando a fila está vazia

		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		// fila.size();
		// fila.clear();
		// fila.isEmpty();

	}
}
