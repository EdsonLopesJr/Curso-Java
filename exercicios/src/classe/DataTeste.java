package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(); // default
		
		Data d2 = new Data(19, 06, 2022);

		Data d3 = new Data();
		d2.dia = 07;
		d2.mes = 12;
		d2.ano = 2022;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
		
	}
}
