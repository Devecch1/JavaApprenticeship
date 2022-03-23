import java.util.Scanner;

public class exercicio_4_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		int duracao;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		
		if(A < B) {
			duracao = B - A;
		} else {
			duracao = 24 - A + B;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
