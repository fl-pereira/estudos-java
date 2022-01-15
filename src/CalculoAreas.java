
public class CalculoAreas {

	public static void main(String[] args) {
		
		double a1, b1, c1, pi, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		a1 = 3.0;
		b1 = 4.0;
		c1 = 5.2;
		
		pi = 3.14159;
		
		areaTriangulo 	= (a1*c1)/2;
		areaCirculo		= c1 * c1 * pi;
		areaTrapezio	= (b1 + a1)*c1/2;
		areaQuadrado	= b1 * b1;
		areaRetangulo	= a1 * b1;
		
		System.out.printf("A área do triângulo é: %.2f %n", areaTriangulo);
		System.out.printf("A área do círculo é: %.2f %n", areaCirculo);
		System.out.printf("A área do trapézio é: %.2f %n", areaTrapezio);
		System.out.printf("A área do quadrado é: %.2f %n", areaQuadrado);	
		System.out.printf("A área do quadrado é: %.2f %n", areaRetangulo);
		
	}

}
