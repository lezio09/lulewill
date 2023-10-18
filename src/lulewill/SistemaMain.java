package lulewill;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaMain {

	public static void main(String[] args) {

		ArrayList<CadastrarVei> veiculos = new ArrayList<>();

		
		ArrayList<CadastrarVei> Carrinho = new ArrayList<>();
		
		
		
		
		
		
		


		Scanner leitura = new Scanner(System.in);

		int op = 1;

		while (op != 0) {

		
			System.out.println("-----MENU EXEMPLO-----");
			System.out.println();
			System.out.println("0 - SAIR DO PROGRAMA  ");
			System.out.println("1 - CADASTRAR VEICULO ");

			System.out.println("2 - PROUCURAR VEICULO ");	
			System.out.println("2 - PROUCURAR VEICULO ");		
			System.out.println("3 - ALTERAR PEDIDO    ");
			System.out.println("----------------------");
			System.out.println();
		
			op = Integer.valueOf(leitura.nextLine());
		
			switch (op) {
			case 0: {

				System.out.println("Saindo");

				break;

			}
			case 1: {

				// Cadastro
				menuCadastro();
				break;
			}
			case 2: {

				menuPrucura();

			}

			case 3: {
				// menuAlterar
			}
			}
		}
	}

	// parte do cadastro
	public static void menuCadastro() {

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
			System.out.println("Você cadastrou um: " + modelo);
			System.out.println("Ano: " + ano);
			System.out.println();
		}
		if (op2 == 2) {
			System.out.println("Saindo");
			System.out.println();

		}
	}

	public static void menuPrucura() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("|Procurar veiculos|");
		System.out.println();
		System.out.println("Marcas de veiculos disponiveis");
		System.out.println();
		System.out.println("1 - Voltar ao Menu ");
		System.out.println("2 - BMW    ");
		System.out.println("3 - Bugatti");
		System.out.println("4 - Fiat   ");
		System.out.println("5 - GTR    ");
		// Add modelo cadastrado
		System.out.println();

		int op2 = Integer.valueOf(leitura.nextLine());

		switch (op2) {

		case 1: {

			// quando finalizar colocar uma fincao
			break;

		}

		case 2: {

			munuBmw();
			break;
		}

		case 3: {

			munuBugatti();
			break;
		}

		case 4: {
			munuFiat();
			break;
		}
		case 5: {
			munuGtr();
			break;
		}
		}
	}

	public static void menuAlterar() {

	}

	// menu da bmw
	public static void munuBmw() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-------------BMW-------------");
		System.out.println();
		System.out.println("1 - BMW Z4      PREÇO:R$ 850.000 ");
		System.out.println("2 - BMW SERIE 4 PREÇO:R$ 925.000 ");
		System.out.println("3 - BMW X2      PREÇO:R$ 500.000 ");
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
				munuBmw();

			}

			if (nd == 2) {
				munuBmw();
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
				munuBmw();
			}

			if (nd == 2) {
				munuBmw();
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
				munuBmw();
			}

		}

		if (op3 == 4) {
			System.out.println("Voltando ao menu");
			System.out.println();
			menuPrucura();
		}

	}

	// menu Bugatti
	public static void munuBugatti() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-------------Bugatti-------------");
		System.out.println();
		System.out.println("1 - Bugatti Chiron     PREÇO:R$ 950.000     ");
		System.out.println("2 - Bugatti Veyron 	   PREÇO:R$ 1.425.000   ");
		System.out.println("3 - Bugatti Centodieci PREÇO:R$ 1.840.000   ");
		System.out.println("4 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			System.out.println("Voce deseja add Bugatti Chiron ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuBugatti();
			}

			if (nd == 2) {
				munuBugatti();
			}

		}

		if (op3 == 2) {

			System.out.println("Voce deseja add Bugatti Veyron ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuBugatti();
			}

			if (nd == 2) {
				munuBugatti();
			}

		}
		if (op3 == 3) {

			System.out.println("Voce deseja add Bugatti Centodieci ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuBugatti();
			}

			if (nd == 2) {
				munuBugatti();
			}

		}

		if (op3 == 4) {
			System.out.println("Voltando ao menu");
			System.out.println();
			menuPrucura();
		}

	}

	public static void munuFiat() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-------------Fiat-------------");
		System.out.println();
		System.out.println("1 - Fiat Argo   PREÇO:R$ 80.000 ");
		System.out.println("2 - Fiat Doblo  PREÇO:R$ 25.000 ");
		System.out.println("3 - Fiat Mobi   PREÇO:R$ 90.000 ");
		System.out.println("4 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			System.out.println("Voce deseja add Fiat Argo ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuFiat();

			}

			if (nd == 2) {
				munuFiat();
			}

		}

		if (op3 == 2) {

			System.out.println("Voce deseja add Fiat Doblo ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuFiat();
			}

			if (nd == 2) {
				munuFiat();

			}

		}
		if (op3 == 3) {

			System.out.println("Voce deseja add Fiat Mobi ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuFiat();
			}

			if (nd == 2) {
				munuFiat();
			}

		}

		if (op3 == 4) {
			System.out.println("Voltando ao menu");
			System.out.println();
			menuPrucura();

		}

	}

	public static void munuGtr() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-------------GTR-------------");
		System.out.println();
		System.out.println("1 - GTR Supra   PREÇO:R$ 1.000.000 ");
		System.out.println("2 - GTR r35     PREÇO:R$ 925.000   ");
		System.out.println("3 - GTR max     PREÇO:R$ 1.500.000 ");
		System.out.println("4 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			System.out.println("Voce deseja add GTR Supra ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuGtr();

			}

			if (nd == 2) {
				munuGtr();
			}

		}

		if (op3 == 2) {

			System.out.println("Voce deseja add GTR r35 ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();

				munuGtr();
			}

			if (nd == 2) {
				munuGtr();
			}

		}
		if (op3 == 3) {

			System.out.println("Voce deseja add GTR max ao carrinho ?");
			System.out.println("1 - sim");
			System.out.println("2 - nao");
			System.out.println();

			int nd = Integer.valueOf(leitura.nextLine());

			if (nd == 1) {
				System.out.println("Produto adicionado");
				System.out.println();
				munuGtr();
			}

			if (nd == 2) {
				munuGtr();
			}

		}

		if (op3 == 4) {
			System.out.println("Voltando ao menu");
			System.out.println();
			menuPrucura();

		}

	}
}
