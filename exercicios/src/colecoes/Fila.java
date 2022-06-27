package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// Offer e Add --> Adicionam elementos na fila

		// Diferen�a � o comportamento ocorre quando a fila est� cheia!

		fila.add("Ana"); // retorna false
		fila.offer("Junior"); // Lan�a uma exce��o
		fila.add("Edson");
		fila.offer("Jennifer");
		fila.add("Flavia");
		fila.offer("Jade");

		// Peek e Element --> Obter o pr�ximo elementos da fila(sem remover)

		// Diferen�a � o comportamento ocorre quando a fila est� vazia!

		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());// Lan� uma exce��o
		System.out.println(fila.element());

		// Poll e Remove --> Obter o pr�ximo elementos da fila e remove!
		// Diferen�a � o comportamento ocorre quando a fila est� vazia

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
