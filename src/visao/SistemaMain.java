package visao;

import java.util.ArrayList;
import java.util.Scanner;

import controle.VeiculoDAO;
import modelo.Carrinho;
import modelo.Veiculo;

public class SistemaMain {
	static VeiculoDAO veiculoDAO = VeiculoDAO.getInstancia();
	static Carrinho carrinho = new Carrinho();

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		int op = 1;

		while (op != 0) {

			System.out.println("-----MENU PRINCIPAL-----");
			System.out.println();
			System.out.println("0 - SAIR DO PROGRAMA  ");
			System.out.println("1 - CADASTRAR VEICULO ");
			System.out.println("2 - PROUCURAR VEICULO ");
			System.out.println("3 - ALTERAR PEDIDO    ");
			System.out.println("4 - ACESSAR CARRINHO  ");
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
				break;

			}

			case 3: {
				menuAlterar();
			}
			}
		}
	}

	// parte do cadastro
	public static void menuCadastro() {

		Scanner leitura = new Scanner(System.in);
		Veiculo veiculo = new Veiculo();

		System.out.print("Nome do veículo: ");
		String nome = String.valueOf(leitura.nextLine());
		veiculo.setNome(nome);
		
		System.out.print("Modelo do veículo: ");
		String modelo = String.valueOf(leitura.nextLine());
		veiculo.setModelo(modelo);
		
		System.out.print("Ano do veículo: ");
		Integer ano = Integer.valueOf(leitura.nextLine());
		veiculo.setAno(ano);

		System.out.println("Informe o preço do veículo: ");
		Double preco = Double.valueOf(leitura.nextLine());
		veiculo.setPreco(preco);

		System.out.println();
		System.out.println("Tem certeza que quer cadastrar o veiculo ?");
		System.out.println("1 - Sim");
		System.out.println("2 - Nao");
		System.out.println();

		///////////////////////////////////////////////////////////////
		///// setar carrinho
//		Carrinho novoCarrinho = new Carrinho();

		int op2 = Integer.valueOf(leitura.nextLine());

		if (op2 == 1) {

			System.out.println("Veiculo Cadastrado");
			System.out.println();
			veiculoDAO.inserir(veiculo);
			// System.out.println("Você cadastrou um: " + modelo);
			// System.out.println("Ano: " + ano);
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
		System.out.println("6 - veiculo cadastrado");
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
		case 6: {
			ArrayList<Veiculo> veiculos = veiculoDAO.listarVeiculos();

			for (int i = 0; i < veiculos.size(); i++) {
				Veiculo veiculo = veiculos.get(i);
				System.out.println((i + 1) + " - " + veiculo);
			}
			System.out.println();
		}
		}
	}

	public static void menuAlterar() {
		Scanner leitura = new Scanner(System.in);
		ArrayList<Veiculo> veiculos = veiculoDAO.listarVeiculos();

		System.out.println("----- MENU ALTERAR VEÍCULO CADASTRADO -----");
		System.out.println("Digite o número do veículo que deseja alterar:");
		for (int i = 0; i < veiculos.size(); i++) {
			System.out.println(i + " - " + veiculos.get(i).getNome());
		}
		int op2 = Integer.valueOf(leitura.nextLine());

		if (op2 >= 0 && op2 < veiculos.size()) {
			Veiculo veiculoParaAlterar = veiculos.get(op2);

			// Agora você pode alterar o veículo selecionado (veiculoParaAlterar)
			// Exemplo: Alterar o nome do veículo

			System.out.println("----- MENU ALTERAR VEÍCULO CADASTRADO -----");
			System.out.println("1 - Alterar nome do veículo:   ");
			System.out.println("2 - Alterar modelo do veículo: ");
			System.out.println("3 - Alterar ano do veículo:    ");
			System.out.println("4 - Alterar preço:             ");
			System.out.println("4 - Voltar ao menu principal:  ");
			System.out.println();

			int op1 = Integer.valueOf(leitura.nextLine());

			switch (op1) {

			case 1: {
				System.out.print("Digite o novo nome do veículo: ");
				String novoNome = leitura.nextLine();
				veiculoParaAlterar.setNome(novoNome);
				System.out.println("Nome do veículo alterado com sucesso.");
				break;
			}

			case 2: {

				System.out.print("Digite o novo modelo do veículo: ");
				String novoModelo = leitura.nextLine();
				veiculoParaAlterar.setModelo(novoModelo);
				System.out.println("Modelo do veículo alterado com sucesso.");
				break;

			}
			case 3: {

				System.out.print("Digite o novo ano do veículo: ");
				Integer novoAno = leitura.nextInt();
				veiculoParaAlterar.setAno(novoAno);
				System.out.println("Ano do veículo alterado com sucesso.");
				break;

			}
			case 4: {
				// Voltar ao menu principal
				break;
			}
			}
		} else {
			System.out.println("Opção inválida. Por favor, escolha um número de veículo válido.");

		}

	}

	// menu da bmw
	public static void munuBmw() {

		
		
		
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("-------------BMW-------------");
		System.out.println();
		System.out.println("1 - BMW Z4       Ano:201   PREÇO:R$ 850.000 ");
		System.out.println("2 - BMW SERIE 4  Ano:2010  PREÇO:R$ 925.000 ");
		System.out.println("3 - BMW X2       Ano:2015  PREÇO:R$ 500.000 ");
		System.out.println("4 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			if (op3 == 1) {
			    System.out.println("Você deseja adicionar BMW Z4 ao carrinho?");
			    System.out.println("1 - Sim");
			    System.out.println("2 - Não");

			    int nd = Integer.valueOf(leitura.nextLine());

			    if (nd == 1) {
			        // Exibindo os veículos disponíveis para o usuário escolher
			        for (int i = 0; i < tabelaVeiculos.size(); i++) {
			            System.out.println((i + 1) + " - " + tabelaVeiculos.get(i).getNome());
			        }

			        // Solicitando que o usuário escolha um veículo
			        System.out.println("Escolha um veículo:");
			        int escolhaVeiculo = Integer.valueOf(leitura.nextLine());

			        // Verificando se a escolha do usuário é válida
			        if (escolhaVeiculo >= 1 && escolhaVeiculo <= tabelaVeiculos.size()) {
			            // Obtendo o veículo selecionado
			            Veiculo veiculoSelecionado = tabelaVeiculos.get(escolhaVeiculo - 1);

			            // Adicionando o veículo ao carrinho
			            carrinho.adicionarItem(veiculoSelecionado);

			            System.out.println("Produto adicionado ao carrinho");
			            System.out.println();
			            munuBmw();
			        } else {
			            System.out.println("Escolha inválida. Tente novamente.");
			            munuBmw();
			        }
			    } else {
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
				System.out.println("Produto adicionado ao carrinho");
			    carrinho.adicionarItem(BMWSERIE4);
			    System.out.println();
			    munuBmw();
			}

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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(BMWX2);
		    System.out.println();
		    munuBmw();
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
	System.out.println("1 - Bugatti Chiron     Ano:2010     PREÇO:R$ 950.000     ");
	System.out.println("2 - Bugatti Veyron     Ano:2006     PREÇO:R$ 1.425.000   ");
	System.out.println("3 - Bugatti Centodieci Ano:2009     PREÇO:R$ 1.840.000   ");
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(BugattiChiron);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(BugattiVeyron);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(BugattiCentodieci);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(FiatArgo);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(FiatDoblo);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(FiatMobi);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(GTRSupra);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(GTRR35);
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
			System.out.println("Produto adicionado ao carrinho");
		    carrinho.adicionarItem(GTRMax);
		    System.out.println();
			munuGtr();
			
			
			
		}

	}
	}
}
