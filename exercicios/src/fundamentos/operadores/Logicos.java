package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		System.out.println("************************");
		System.out.println("Tabela verdade E (AND)\n");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("************************");
		System.out.println("Tabela verdade OU (OR)\n");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("************************");
		System.out.println("Tabela verdade OU Exclusivo (XOR)\n");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("************************");
		System.out.println("Tabela verdade NOT\n");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
		System.out.println(!!false);
		
	}
}
