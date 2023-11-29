package visao;

import java.util.ArrayList;
import java.util.List;
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
				break;
			}
			case 4: {
				menuCarrinho();
				break;
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
		System.out.println("1 - Menu de Procura ");
		System.out.println("2 - Voltar ao Menu  ");
		// Add modelo cadastrado
		System.out.println();

		int op2 = Integer.valueOf(leitura.nextLine());

		switch (op2) {

		case 1: {
			munu2Procura();
			// quando finalizar colocar uma fincao
			break;

		}

		case 2: {

			break;
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

			// Exibindo os veículos disponíveis para o usuário escolher
			for (int i = 0; i < veiculoDAO.listarVeiculos().size(); i++) {
				Veiculo veiculo = veiculoDAO.listarVeiculos().get(i);
				System.out.println((i + 1) + " - " + veiculo.getNome() + " | Ano: " + veiculo.getAno() + " | Preço: R$ "
						+ veiculo.getPreco());
			
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

		if (op3 == 2) {
			System.out.println("Voltando ao menu");
			System.out.println();
			menuPrucura();
		}

	}

	public static void menuCarrinho() {

		Scanner leitura = new Scanner(System.in);

		System.out.println("----- CARRINHO -----");
		System.out.println("1 - Visualizar Itens do Carrinho");
		System.out.println("2 - Remover Item do Carrinho");
		System.out.println("3 - Voltar ao Menu Principal");
		System.out.println();

		int opCarrinho = Integer.valueOf(leitura.nextLine());

		switch (opCarrinho) {
		case 1: {
			visualizarItensCarrinho();
			break;
		}
		case 2: {
			removerItemCarrinho();
			break;
		}
		case 3: {
			// Voltar ao menu principal
			break;
		}
		default: {
			System.out.println("Opção inválida.");
		}
		}
	}

	public static void visualizarItensCarrinho() {

		List<Veiculo> itensCarrinho = carrinho.getItens();

		if (itensCarrinho.isEmpty()) {
			System.out.println("O carrinho está vazio.");
		} else {
			System.out.println("----- ITENS DO CARRINHO -----");
			for (int i = 0; i < itensCarrinho.size(); i++) {
				Veiculo veiculo = itensCarrinho.get(i);
				System.out.println((i + 1) + " - " + veiculo.getNome() + " | Ano: " + veiculo.getAno() + " | Preço: R$ "
						+ veiculo.getPreco());
			}
			System.out.println();
		}
	}

	public static void removerItemCarrinho() {
		Scanner leitura = new Scanner(System.in);

		List<Veiculo> itensCarrinho = carrinho.getItens();

		if (itensCarrinho.isEmpty()) {
			System.out.println("O carrinho está vazio.");
			return;
		}

		// Exibir itens do carrinho
		System.out.println("----- ITENS DO CARRINHO -----");
		for (int i = 0; i < itensCarrinho.size(); i++) {
			Veiculo veiculo = itensCarrinho.get(i);
			System.out.println((i + 1) + " - " + veiculo.getNome() + " | Ano: " + veiculo.getAno() + " | Preço: R$ "
					+ veiculo.getPreco());
		}

		System.out.println("Escolha o número do item que deseja remover:");
		int escolhaItem = Integer.valueOf(leitura.nextLine());

		if (escolhaItem >= 1 && escolhaItem <= itensCarrinho.size()) {
			// Remover o item escolhido do carrinho
			Veiculo itemRemover = itensCarrinho.get(escolhaItem - 1);
			carrinho.removerItem(itemRemover);
			System.out.println("Item removido do carrinho.");
		} else {
			System.out.println("Escolha inválida. Tente novamente.");
			removerItemCarrinho();
		}
	}

}