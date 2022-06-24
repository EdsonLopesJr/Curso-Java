package fundamentos;

public class ConvesorTemperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C	
		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double f = 95.0;
		double c = (f - AJUSTE) * FATOR; 
		
		System.out.println("O Resultado é " + c + "°C.");
		
		f= 0;
		c = (f - AJUSTE) * FATOR;
		
		System.out.println("O Resultado é " + c + "°C.");

	}
}
