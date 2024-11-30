package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidade.estudante;

public class Aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int qtdeEstudantes = sc.nextInt();
		
		int[] vetor = new int[qtdeEstudantes];
		

		sc.close();
	}

}
