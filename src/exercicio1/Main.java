package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final List<Crianca> criancas_com_presente = new ArrayList<Crianca>();

		boolean is_add_mais_criancas = true;
		while (is_add_mais_criancas) {
			System.out.print("Informe o Nome da criança: ");
			String nome = sc.next();

			try {
				System.out.print("Informe se é uma criança MALVADA ou BOAZINHA:");
				Personalidades personalidade = Personalidades.valueOf(sc.next().toUpperCase());

				final Crianca crianca = new Crianca(nome, personalidade);
				if (personalidade == Personalidades.BOAZINHA) {
					criancas_com_presente.add(crianca);
				}
				System.out.print("Existem mais crianças? [SIM: 1] [NAO: qualquer caracter]");
				is_add_mais_criancas = (sc.nextInt() == 1);

			} catch (Exception e) {
				System.out.println("Informe corretamente a personalidade da crianca.");
			}
		}
		sc.close();

		System.out.println("TOTAL DE CRIANCAS QUE RECEBERAO PRESENTES: " + criancas_com_presente.size());

	}

}