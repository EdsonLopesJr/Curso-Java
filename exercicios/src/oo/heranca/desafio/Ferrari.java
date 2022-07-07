package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(410);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
}
