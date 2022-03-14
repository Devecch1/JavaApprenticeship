import java.util.Scanner;

public class exercicio_1_estrutura_sequencial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
			
		soma = (double) x + y;
		
		System.out.println("Entrada: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println("Saída: ");
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
