import java.util.Locale;
import java.util.Scanner;

public class operadores_atribuicao_cumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double conta;
		
		minutos = sc.nextInt();
		conta = 50;
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2;
			// o conta += determina uma abreviaçao onde seria conta = conta + restante do calculo
		}
		
		System.out.printf("Valor a pagar R$ %.2f%n", conta);
		
		
		sc.close();
	}

}
