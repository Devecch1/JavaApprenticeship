import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		
		System.out.print("Ol� Mundo!");
		System.out.println("Bom dia!");
		System.out.println("Vari�veis");
		System.out.println(y);
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("RESULTADO = %.2f metros%n", x); //o %n no final tem a finalidade de que o print abaixo n�o venha na mesma linha retratada
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// marcadores de vari�veis
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n quebra de linha
	}

}
