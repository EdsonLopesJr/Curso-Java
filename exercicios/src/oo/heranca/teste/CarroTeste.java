package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
//		ferrari.ligarTurbo();
		ferrari.ligarAr();
		
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.frear();
		System.out.println(ferrari);
		System.out.println(ferrari.nivelDoAr());
		
		Carro civic = new Civic();
		System.out.println();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
	}
}
