import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		int numBase = 0;
		
		Scanner sc 	= new Scanner(System.in);		
		
		System.out.println("Insira um número: ");
		int numUser = sc.nextInt();
		
		if(numUser < 0) {
			System.out.println("O número é negativo.");
		}
		else if(numUser == 0) {
			System.out.println("O número é ZERO");
		}
		else {
			System.out.println("O número é positivo");
		}
		
		sc.close();		
	
	}

}
