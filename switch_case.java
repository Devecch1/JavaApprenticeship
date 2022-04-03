import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dia;
		int x;
		
		x = sc.nextInt();
		
//		if(dia == 1) {
//			System.out.println("Dia da Semana é Domingo");
//		} else if (dia == 2) {
//			System.out.println("Dia da Semana é Segunda");
//		} else if (dia == 3) {
//			System.out.println("Dia da Semana é Terça");
//		} else if (dia == 4) {
//			System.out.println("Dia da Semana é Quarta");
//		} else if (dia == 5) {
//			System.out.println("Dia da Semana é Quinta");
//		} else if (dia == 6 ) {
//			System.out.println("Dia da Semana é Sexta");
//		} else if (dia == 7) {
//			System.out.println("Dia da Semana é Sabado");
//		} else {
//			System.out.println("Dia da Semana é Invalido");
//		}
			
		// PODERIA SIMPLESMENTE COLOCAR UM PRINTLN NO FINAL System.out.println("Dia da Semana é " + dia);

		
		switch(x) {
			case 1:
				dia = "domingo";
		break;
			case 2:
				dia = "segunda";
		break;
			case 3:
				dia = "terça";
		break;
			case 4:
				dia = "quarta";
		break;
			case 5:
				dia = "quinta";
		break;
			case 6:
				dia = "sexta";
		break;
			case 7:
				dia = "sabado";
		break;
		default:
			dia = "Inválido";
		break;
		}
		
		System.out.println("Dia da semana é " + dia);
		
		sc.close();
	}

}
