import java.util.Scanner;

public class exercicio_1_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
