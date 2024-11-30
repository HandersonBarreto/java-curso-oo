package exercicio_2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int tamanhoVetor = sc.nextInt();
		double soma, media;

		double[] vetor = new double[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		soma = 0.0;
		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		media = soma / vetor.length;

		System.out.print("VALORES = ");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f  ", vetor[i]);
		}

		System.out.printf("SOMA: %.2f", soma);
		System.out.printf("SOMA: %.2f", media);
		sc.close();

	}
}
