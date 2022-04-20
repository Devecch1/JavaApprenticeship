import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class debug {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <String> nomes = new ArrayList<>();
		
		for(int i=0; i< 5;i++) {
			System.out.printf("Digite o nome: " + i);
			nomes.add(sc.nextLine());
		}
		for(int i=0; i<= 5;i++) {
			System.out.printf("Nome " + i + nomes.get(i));
		}
		
//		nomes.forEach(System.out::println);
		
		sc.close();
	}

}
