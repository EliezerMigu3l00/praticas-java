import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		System.out.print("Escreva seu nome: ");
		
		x = sc.next();
		
		System.out.print("Então seu nome é " + x);
		
		sc.close();
	}

}
