import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int qtdeAlunos = sc.nextInt();

		String[] nome = new String[qtdeAlunos];
		double[] primeiraNota = new double[qtdeAlunos];
		double[] segundaNota = new double[qtdeAlunos];

		double media = 0.0;
		int posicao = 0;

		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %do aluno\n", (i + 1));
			sc.nextLine();
			nome[i] = sc.nextLine();
			primeiraNota[i] = sc.nextDouble();
			segundaNota[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados: ");
		
		for (int i = 0; i < qtdeAlunos; i++) {
			media = (primeiraNota[i] + segundaNota[i]) / 2;
			if (media >= 6.0) {
				posicao = i;
				System.out.printf("%s\n", nome[i]);
			}
		}

		

		sc.close();
	}

}
