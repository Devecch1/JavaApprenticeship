import java.util.Scanner;

public class exercicio_3_estrutura_condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		} else {
			System.out.println("N�o S�o Multiplos");
		}
		sc.close();
	}

}
