import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanhoVetor = sc.nextInt();

		double[] vetor = new double[tamanhoVetor];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		double valorTotalVetor = 0.0;

		for (int i = 0; i < vetor.length; i++) {
			valorTotalVetor += vetor[i];
		}

		double media = valorTotalVetor / tamanhoVetor;

		System.out.printf("MEDIA DO VETOR = %.3f", media);
		System.out.println("\nELEMENTOS ABAIXO DA MEDIA: ");

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		sc.close();

	}

}
