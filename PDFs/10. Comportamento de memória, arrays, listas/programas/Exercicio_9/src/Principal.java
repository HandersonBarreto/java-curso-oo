import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int tamanhoVetor = sc.nextInt();

		String[] vetorNome = new String[tamanhoVetor];
		int[] vetorIdade = new int[tamanhoVetor];

		for (int i = 0; i < tamanhoVetor; i++) {
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			vetorNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}
		int maior = 0, posicao = 0;

		for (int i = 0; i < tamanhoVetor; i++) {
			if (maior < vetorIdade[i]) {
				maior = vetorIdade[i];
				posicao = i;
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + vetorNome[posicao]);
		sc.close();

	}

}
