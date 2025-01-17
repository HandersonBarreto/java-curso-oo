package programa;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas: ");
		int quantidade = sc.nextInt();

		Pessoa[] vetor = new Pessoa[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Altura da %da pessoa: ", (i + 1));
			double altura = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", (i + 1));
			char genero = sc.next().charAt(0);

			vetor[i] = new Pessoa(altura, genero);
		}

		double menorAltura = vetor[0].getAltura(), maiorAltura = 0.0, mediaAlturaFeminina = 0.0, soma = 0.0;
		int posicao = 0, qtdeHomens = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (menorAltura > vetor[i].getAltura()) {
				menorAltura = vetor[i].getAltura();
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (maiorAltura < vetor[i].getAltura()) {
				maiorAltura = vetor[i].getAltura();
			}

		}

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getGenero() == 'F') {
				soma += vetor[i].getAltura();
				posicao++;
				mediaAlturaFeminina = soma / posicao;
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getGenero() == 'M') {
				qtdeHomens++;
			}
		}

		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres =  %.2f\n", mediaAlturaFeminina);
		System.out.printf("Numero de homens = %d\n", qtdeHomens);
		
		sc.close();

	}

}
