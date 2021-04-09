import java.util.Scanner;

public class Sequencial6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.println("A" + "=" + area);
		
		sc.close();
	}

}
