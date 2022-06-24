package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Edson";
		var sobrenome = "Lopes Jr";
		var idade = 22;
		var salario = 1200.9854;
		
		String exemploDeFrase = "Nome: " + nome +
								"\nSobrenome: " + sobrenome +
								"\nIdade: " + idade +
								"\nSalário: "+ salario + "\n\n";
		System.out.println(exemploDeFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f.\n\n",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}

}
