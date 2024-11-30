package entidade;

public class Banco {

	private int numeroConta;
	private String titular;
	private double depositoInicial;

	public Banco(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public Banco(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.depositoInicial = depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void deposito(double valor) {
		depositoInicial += valor;
	}

	public void saque(double valor) {
		depositoInicial -= valor + 5;

	}

	public String toString() {
		return "Conta " + numeroConta + ", " + "Titular " + titular + ", " + "Saldo R$ "
				+ String.format("%.2f", depositoInicial);

	}

}
