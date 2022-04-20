import java.util.Scanner;

public class estrutura_repetitiva_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		
		
		soma = 0;
		
		do {
			System.out.println("Digite um valor");
			x = sc.nextInt();
			soma = soma + x;
		}
		while(x != 0);
		
		System.out.printf("Valor é:" + soma);
		sc.close();
	}

}
