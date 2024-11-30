import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros você vai digitar? ");
		int qtdeNumerosDigitados = sc.nextInt();

		int[] vetor = new int[qtdeNumerosDigitados];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS NEGATIVOS");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}

		sc.close();

	}

}
