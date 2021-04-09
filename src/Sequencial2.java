import java.util.Scanner;

public class Sequencial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, pi;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		triangulo = a/2 * c;
		circulo = pi * Math.pow(c, 2);
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.println("TRIANGULO: " + triangulo);
		System.out.println("CIRCULO: " + circulo);
		System.out.println("TRAPEZIO: " + trapezio);
		System.out.println("QUADRADO: " + quadrado);
		System.out.println("RETANGULO: " + retangulo);
		
		sc.close();
	}

}
