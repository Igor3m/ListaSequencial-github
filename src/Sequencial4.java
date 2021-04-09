import java.util.Scanner;

public class Sequencial4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int funcionario, horasTrabalhadas;
		funcionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		
		double valorHora;
		valorHora = sc.nextDouble();
		
		double salario;
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.println("SALARY = U$ " + salario);
		
		sc.close();
	}

}
