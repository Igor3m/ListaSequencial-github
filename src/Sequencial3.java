import java.util.Scanner;

public class Sequencial3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int peca1, peca2, quantP1, quantP2;
		float valorP1, valorP2;
		peca1 = sc.nextInt();
		quantP1 = sc.nextInt();
		valorP1 = sc.nextFloat();
		peca2 = sc.nextInt();
		quantP2 = sc.nextInt();
		valorP2 = sc.nextFloat();
		
		float pagamento;
		pagamento = quantP1 * valorP1 + quantP2 * valorP2;
		
		System.out.println("VALOR A PAGAR: R$ " + pagamento);
		
		sc.close();
	}

}
