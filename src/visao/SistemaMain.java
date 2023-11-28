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
			case 4: {

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
		System.out.println("2 - Menu de Procura    ");
		System.out.println("3 - veiculo cadastrado");
		// Add modelo cadastrado
		System.out.println();

		int op2 = Integer.valueOf(leitura.nextLine());

		switch (op2) {

		case 1: {

			// quando finalizar colocar uma fincao
			break;

		}

		case 2: {

			munu2Procura();
			break;
		}

		case 3: {
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
	public static void munu2Procura() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("-----------Menu-de-Procura-----------");
		System.out.println();
		System.out.println("1 - Veiculos Disponiveis ");
		System.out.println("2 - VOLTAR AO MENU");
		System.out.println();

		int op3 = Integer.valueOf(leitura.nextLine());

		// clase para o carrinho
		if (op3 == 1) {
			if (op3 == 1) {

				System.out.println("Entrar nos Veiculos?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");

				int nd = Integer.valueOf(leitura.nextLine());

				if (nd == 1) {
					// Exibindo os veículos disponíveis para o usuário escolher
					for (int i = 0; i < veiculoDAO.listarVeiculos().size(); i++) {
						System.out.println((i + 1) + " - " + veiculoDAO.listarVeiculos().get(i).getNome());
					}

					// Solicitando que o usuário escolha um veículo
					System.out.println("Escolha um veículo:");
					int escolhaVeiculo = Integer.valueOf(leitura.nextLine());

					// Verificando se a escolha do usuário é válida
					if (escolhaVeiculo >= 1 && escolhaVeiculo <= veiculoDAO.listarVeiculos().size()) {
						// Obtendo o veículo selecionado
						Veiculo veiculoSelecionado = veiculoDAO.listarVeiculos().get(escolhaVeiculo - 1);

						// Adicionando o veículo ao carrinho

						System.out.println("Produto adicionado ao carrinho");
						System.out.println();
						carrinho.adicionarItem(veiculoSelecionado);
					} else {
						System.out.println("Escolha inválida. Tente novamente.");
						munu2Procura();
					}
				} else {
					munu2Procura();
				}
			}

			if (op3 == 2) {
				System.out.println("Voltando ao menu");
				System.out.println();
				menuPrucura();
			}

		}

		// menu Bugatti

	}
}
