package lulewill;

import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		int op = 1;

		while (op != 0) {

			System.out.println("- MENU EXEMPLO -");
			System.out.println();
			System.out.println("0 SAIR DO PROGRAMA");
			System.out.println("1 CADASTRAR VEICULO");
			System.out.println("2 PROUCURAR VEICULO");
			System.out.println("3 ALTERAR PEDIDO");
			System.out.println();

			op = Integer.valueOf(leitura.nextLine());

			switch (op) {
			case 0: {

				System.out.println("Saindo");

				break;

			}
			case 1: {
				menu1();
				break;
			}
			case 2: {

				System.out.println("|Procurar veiculos|");
				System.out.println();
				System.out.println("Marcas de veiculos disponiveis");
				System.out.println();
				System.out.println("1 - Voltar ao Menu ");
				System.out.println("2 - BMW");
				System.out.println("3 - Bugatti");
				System.out.println("4 - Fiat");
				System.out.println("5 - GTR");
				// Add modelo cadastrado
				System.out.println();

				int op2 = Integer.valueOf(leitura.nextLine());

				switch (op2) {

				case 1: {

					break;

				}

				case 2: {

					munuBmw();
					break;

				}
				}

			}

			}
		}

	}

	public static void menu1() {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Cadastrar Veiculo");
		System.out.println();

		System.out.println("modelo: ");
		String modelo = leitura.nextLine();

		System.out.println("Ano: ");
		int ano = Integer.valueOf(leitura.nextLine());

		System.out.println();
		System.out.println("Tem certeza que quer cadastrar o veiculo ?");
		System.out.println("1 - Sim");
		System.out.println("2 - Nao");
		System.out.println();

		int op2 = Integer.valueOf(leitura.nextLine());

		if (op2 == 1) {

			System.out.println("Veiculo Cadastrado");
			System.out.println();
			System.out.println("Voce cadastrouum: " + modelo);
			System.out.println("Ano: " + ano);
			System.out.println();
		}
		if (op2 == 2) {
			System.out.println("Saindo");
			System.out.println();

		}
	}

	public static void munuBmw() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-----BMW-----");
		System.out.println();
		System.out.println("1 - BMW Z4      PREÇO:R$ 850 mil ");
		System.out.println("2 - BMW SERIE 4 PREÇO:R$ 925 mil ");
		System.out.println("3 - BMW X2      PREÇO:R$ 500 mil ");
		System.out.println("4 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			System.out.println("Voce deseja add BMW Z4 ou carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();

			}

			if (nd == 2) {

			}

		}

		if (op3 == 2) {

			System.out.println("Voce deseja add BMW SERIE 4 ou carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
			}

			if (nd == 2) {
				break;
			}

		}
		if (op3 == 3) {

			System.out.println("Voce deseja add BMW X2 ou carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
			}

			if (nd == 2) {
				break;
			}

		}

		if (op3 == 4) {
			System.out.println("Voltando ao menu");
			System.out.println();

			break;

		}

	}

}