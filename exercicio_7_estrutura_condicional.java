import java.util.Locale;
import java.util.Scanner;

public class exercicio_7_estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Sa�da: Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Sa�da: Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Sa�da: Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Sa�da: Q3");
		} else {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
