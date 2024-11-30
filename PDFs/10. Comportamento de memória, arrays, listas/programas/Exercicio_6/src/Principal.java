import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int tamanhoVetor = sc.nextInt();

		int[] vetorA = new int[tamanhoVetor];
		int[] vetorB = new int[tamanhoVetor];
		int[] vetorC = new int[tamanhoVetor];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B:");

		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = sc.nextInt();
		}

		System.out.println("VETOR RESULTANTE: ");

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

		sc.close();

	}

}
