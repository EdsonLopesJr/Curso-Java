package colecoes;


import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set <String> lista = new HashSet <String>();
//		Set <String> lista = new TreeSet<String>();		
		SortedSet <String> lista = new TreeSet <String>();
		lista.add("Edson");
		lista.add("Jennifer");
		lista.add("Junior");
		lista.add("Ana");
		lista.add("Flavia");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
