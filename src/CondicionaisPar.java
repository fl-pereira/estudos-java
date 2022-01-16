import java.util.Scanner;

public class CondicionaisPar {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		
		System.out.println("Insira um número qualquer: ");
		double x = i.nextInt();
		double restoDivisao = x % 2;
		
		if(restoDivisao == 0) {
			System.out.println("Número PAR");
		}
		else {
			System.out.println("Número IMPAR");
		}
		
		i.close();
	}

}
