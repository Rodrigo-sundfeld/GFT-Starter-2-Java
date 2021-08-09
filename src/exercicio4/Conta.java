package exercicio4;

abstract class Conta {

	private int numero;
	private String nome;
	private double saldo;
	
	public double getRendimento() {
		return this.saldo * 0.1;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
