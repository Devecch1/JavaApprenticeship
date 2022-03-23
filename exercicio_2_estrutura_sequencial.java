import java.util.Locale;
import java.util.Scanner;

public class exercicio_2_estrutura_sequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, A;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		A = pi * (raio * raio);
		
		System.out.printf("Saída A = %.4f%n", A);
		
		sc.close();
	}

}
