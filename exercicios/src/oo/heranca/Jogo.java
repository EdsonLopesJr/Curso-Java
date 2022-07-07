package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10, 11);

		System.out.println(monstro.vida);
		System.out.println(heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Vida do Monstro: " + monstro.vida);
		System.out.println("Vida do Heroi: " + heroi.vida);

	}
}
