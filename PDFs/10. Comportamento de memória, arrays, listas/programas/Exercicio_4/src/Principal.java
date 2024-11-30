import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int qtdeNumeros = sc.nextInt();

		int[] vetor = new int[qtdeNumeros];

		// incia ; comparacao ; incremento
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		int qtdepares = 0;
		System.out.println("NÚMEROS PARES: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				qtdepares++;
			}

		}
		System.out.println();
		System.out.printf("Quantidade pares %d", qtdepares);
		sc.close();
	}

}
