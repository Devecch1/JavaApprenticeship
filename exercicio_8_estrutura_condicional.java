import java.util.Locale;
import java.util.Scanner;

public class exercicio_8_estrutura_condicional {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda;
		double total;
		
		renda = sc.nextDouble();
		
		if(renda >= 0 && renda <= 2000) {
			System.out.println("Isento");
		} else if(renda > 2000 && renda <= 3000) {
			total = renda * 0.08;
		} else if(renda > 3000 && renda <= 4500) {
			total = renda * 0.18;
		} else {
			total = renda * 0.28;
		} 
		sc.close();
	}

}
