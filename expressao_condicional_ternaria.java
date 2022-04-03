
public class expressao_condicional_ternaria {

	public static void main(String[] args) {

		double preco;
//		double desconto;
		
		preco = 34.5;
		
//		if(preco < 20) {
//			desconto = preco * 0.01;
//		} else {
//			desconto = preco * 0.05;
//		}
		
		double desconto = (preco < 20) ? preco * 0.01 : preco * 0.05; 
		
		System.out.println("Desconto de " + desconto);
	}

}
