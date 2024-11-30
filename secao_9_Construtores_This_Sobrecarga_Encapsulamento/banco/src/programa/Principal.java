package programa;

import java.util.Locale;
import java.util.Scanner;

import entidade.Banco;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Banco banco;

		System.out.print("Entre com o número da conta: ");
		int numeroConta = sc.nextInt();

		sc.nextLine();

		System.out.print("Entre com o titular da conta: ");
		String titular = sc.nextLine();

		System.out.print("Existe um depósito inicial (s/n)?");
		char resposta = sc.next().charAt(0);

		if (resposta == 'y') {
			System.out.print("Entre com o valor inicial: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numeroConta, titular, depositoInicial);

		} else {
			banco = new Banco(numeroConta, titular);
		}

		System.out.print("Dados da conta:");
		System.out.println(banco);

		System.out.print("Entre com o valor do deposito: ");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Dados da conta:");
		System.out.println(banco);

		System.out.print("Entre com o valor do saque: ");
		double saque = sc.nextDouble();
		banco.saque(saque);
		System.out.println("Dados da conta:");
		System.out.println(banco);

		sc.close();
	}

}
