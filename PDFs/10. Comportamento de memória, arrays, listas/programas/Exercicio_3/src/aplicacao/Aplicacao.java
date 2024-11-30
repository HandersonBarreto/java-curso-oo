package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoas;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int qtdePessoas = sc.nextInt();

		Pessoas[] vetor = new Pessoas[qtdePessoas];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + i + "a" + " pessoa: ");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();

			vetor[i] = new Pessoas(nome, idade, altura);

		}

		double mediaAltura = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			mediaAltura += vetor[i].getAltura();
		}

		double pessoasMenor16 = 0.0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				pessoasMenor16 += 1;
			}

		}

		System.out.printf("Altura média: %.2f", mediaAltura / vetor.length);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos %.2f", pessoasMenor16 / vetor.length * 100);
		System.out.println();
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}

		}		
		
		sc.close();

	}

}
