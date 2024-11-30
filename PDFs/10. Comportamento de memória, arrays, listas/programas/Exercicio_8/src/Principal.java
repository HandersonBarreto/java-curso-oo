import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanhoVetor = sc.nextInt();

		int[] vetor = new int[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}

		double soma = 0;
		int quantidade = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				quantidade += 1;
			}

		}
		double media = soma / quantidade;

		if (quantidade > 1) {
			System.out.printf("MEDIA DOS PARES %.1f", media);
		} else {
			System.out.println("NUNHUM VALOR PAR");
		}

		sc.close();

	}

}
