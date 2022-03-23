import java.util.Locale;
import java.util.Scanner;

public class exercicio_5_estrutura_sequencial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoItem, codigoItem1, numeroItem, numeroItem1;
		double valorUnit, valorPagar, valorItem1, valorItem2, valorUnit1;
		
		codigoItem = sc.nextInt();
		numeroItem = sc.nextInt();
		valorUnit = sc.nextDouble();
		codigoItem1 = sc.nextInt();
		numeroItem1 = sc.nextInt();
		valorUnit1 = sc.nextDouble();
		
		valorItem1 = (numeroItem * valorUnit);
		valorItem2 = (numeroItem1 * valorUnit1);
		valorPagar = (valorItem1 + valorItem2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);

		sc.close();
	}

}
