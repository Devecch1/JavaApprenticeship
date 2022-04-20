import java.util.Scanner;

public class exercicio_estrutura_repetitiva_while_exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, alcool, gasolina, diesel;
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		System.out.println("DIGITE O CÓDIGO");
		System.out.println("QUANDO ENCERRAR DIGITE 4");
		
		x = sc.nextInt();
		
		while(x != 4) {
			if(x == 1) {
				alcool += 1;
			} else if(x == 2) {
				gasolina +=1;
			} else if(x == 3) {
				diesel += 1;
			}
			
			x = sc.nextInt();
		}
			
		System.out.println("Muito Obrigado!");
		System.out.println("ALCOOL: " + alcool);	
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("DIESEL: " + diesel);
		
		sc.close();
	}

}
