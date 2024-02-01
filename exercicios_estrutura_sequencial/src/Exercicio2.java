import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double raio, pi, area;
		System.out.println("Este programa ira calcular a area de um circulo");
		System.out.println("Para fazer este calculo digite o valor do raio: ");
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2.0);
		System.out.printf("A area de um cinlindor de raio igual a %.2f é igual a %.4f", raio, area);
		sc.close(); 
	}

}
