import java.util.Locale;

public class funcoes_matematicas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double a, b, c;
		double X, Y, Z;
		double delta, x1, x2;
		
		a = 2;
		b = 4;
		c = 1;
		
		X = Math.sqrt(a);
		Y = Math.sqrt(b);
		Z = Math.sqrt(c);
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = ( b + Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);

	}

}
