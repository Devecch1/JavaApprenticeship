import java.util.Locale;
import java.util.Scanner;

public class exercicio_4_estrutura_sequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int funcionario;
		double horaT, valorH, salario;
		
		funcionario = sc.nextInt();
		
		horaT = sc.nextDouble();
		valorH = sc.nextDouble();
		salario = horaT * valorH;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
