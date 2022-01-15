
public class Main {

	public static void main(String[] args) {
	
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritório";
		
		int idade		= 32;
		int cod			= 5290;
		char sexo		= 'M';
		
		double preco1	= 2100.00;
		double preco2 	= 650.50;
		double medida 	= 52.36515432;
		
		System.out.printf("Products:%n");
		System.out.printf("%s, cujo o preço é R$ %.2f. %n", produto1, preco1);
		System.out.printf("%s, cujo o preço é R$ %.2f. %n", produto2, preco2);
		System.out.printf("Record: %d ans de idade, código %d e sexo: %s. %n", idade, cod, sexo);
		System.out.printf("Medida com 8 casas decimais: %f. %n", medida);
		System.out.printf("Medida com 3 casas decimais: %.3f %n", medida);

	}

}
