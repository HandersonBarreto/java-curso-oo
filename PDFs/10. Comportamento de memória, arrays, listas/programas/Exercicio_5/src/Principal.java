import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		int qtdeNumeros = sc.nextInt();

		double[] vetor = new double[qtdeNumeros];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		int posicao = 0;
		double maior = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
				posicao = i;
			}
		}
		System.out.printf("MAIOR VALOR = %.2f", maior);
		System.out.println();
		System.out.printf("POSICAO DO MAIOR VALOR = %d", posicao);
		sc.close();
	}

}
