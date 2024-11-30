package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanhoVetor = sc.nextInt();

		double[] vetor = new double[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {

			soma += vetor[i];
		}

		double avg = soma / tamanhoVetor;
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);

		sc.close();

	}

}
