import java.util.Scanner;

public class exercicio_estrutura_repetitiva_while_exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida");
			
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
