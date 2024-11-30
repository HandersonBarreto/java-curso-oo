package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Aluguel;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vetor = new Aluguel[10];

		System.out.print("How many rooms we be rented? ");
		int qtdeEstudade = sc.nextInt();

		for (int i = 1; i < qtdeEstudade + 1; i++) {
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vetor[room] = new Aluguel(nome, email);
		}

		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		sc.close();
	}

}
