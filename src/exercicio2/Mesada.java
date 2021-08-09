package exercicio2;

public class Mesada {

	public void pagar(double valor) {

	}

	public double sacar(Filho filho, double valor) {
		double valorSacado = valor * filho.getQuotaPorSaque();
		return valorSacado;
	}

	public static void main(String[] args) {
		final Filho comportado = new FilhoComportado();
		final Filho queApronta = new FilhoQueApronta();

		final double valorSaque = 100.0;

		final Mesada mesada = new Mesada();
		System.out
				.println("Para cada saque de R$" + valorSaque + " do filho que apronta ele devolve para o "
						+ "pai R$" + mesada.sacar(queApronta, valorSaque));
		System.out
				.println("Para cada saque de R$" + valorSaque + " do filho comportado ele devolve para o "
						+ "pai R$" + mesada.sacar(comportado, valorSaque));

	}

}
