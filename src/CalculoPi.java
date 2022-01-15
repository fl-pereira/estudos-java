import java.util.Scanner;

public class CalculoPi {

	public static void main(String[] args) {
		
		double piA;
		double raioA;
		double areaCirculoA;
		
		raioA 	= 2.00;
		piA		= 3.14159;
		
		areaCirculoA = piA * raioA * raioA;
		
		System.out.println("EXERCÍCIO 4 - Curso: Java Completo | Prof. Nélio Alves");
		System.out.printf("Sendo o valor do Raio = 2, a área total do círculo é de %.4f %n", areaCirculoA);
		
		double piB;
		double raioB;
		double areaCirculoB;
		
		raioB 	= 100.64;
		piB		= 3.14159;
		
		areaCirculoB = piB * raioB * raioB;
		
		System.out.println("EXERCÍCIO 5 - Curso: Java Completo | Prof. Nélio Alves");
		System.out.printf("Sendo o valor do Raio = 100.64, a área total do círculo é de %.4f %n", areaCirculoB);
		
		double piC;
		double raioC;
		double areaCirculoC;
		
		raioC 	= 150.00;
		piC		= 3.14159;
		
		areaCirculoC = piC * raioC * raioC;
		
		System.out.println("EXERCÍCIO 6 - Curso: Java Completo | Prof. Nélio Alves");
		System.out.printf("Sendo o valor do Raio = 150.00, a área total do círculo é de %.4f %n", areaCirculoC);
		
		int num1, num2, num3, num4, diff;
		String txtDiff = "A diferença é: ";
		
		num1 = 5;
		num2 = 6;
		num3 = 7;
		num4 = 8;
		
		diff = (num1*num2)-(num3*num4);
		
		System.out.printf("%s %d %n",txtDiff, diff);
		
		int numA, numB, numC, numD, diffB;
		String txtDiffB = "A diferença é: ";
		
		numA = 5;
		numB = 6;
		numC = -7;
		numD = 8;
		
		diffB = (numA*numB)-(numC*numD);
		
		System.out.printf("%s %d %n",txtDiffB, diffB);
		
	}

}
