package teste_processamento;

public class Main {

	public static void main(String[] args) {
		int x, y;
		x = 5;
		y = x * 2;

		System.out.println(x);
		System.out.println(y);

		
		
		double b, B, h, area;

		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.printf("A area de um trapezio que tem como base maior %.1f e base menor %.1f e conta um uma altura de %.1f e igual a %.2f%n", B, b, h, area);
		
		
		int a1, b1;
		double resultado;
		
		a1 = 5;
		b1 = 2;
		resultado = (double) a1/b1;
		
		System.out.println(resultado);
		
	}

}
