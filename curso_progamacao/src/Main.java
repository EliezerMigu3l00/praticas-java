import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String nome = "Maria";
		int idade = 23; 
		double renda = 3865.34;
		System.out.printf("%s tem %d anos e seu salario e de %.2f reais%n", nome, idade, renda);
	
	}

}
