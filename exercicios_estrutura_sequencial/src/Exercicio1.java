import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num1, num2, soma;
		 
		 System.out.println("Este programa vai te ajudar a fazer o calculo de dois numeros inteiros");
		 System.out.println("Digite o primeiro numero: ");
		 num1 = sc.nextInt();
		 System.out.println("Digite o segundo numero: ");
		 num2 = sc.nextInt();
		 soma = num1 + num2;
		 System.out.printf("A soma de %d como %d é igual a %d", num1, num2, soma);
		 sc.close();
	}

}
