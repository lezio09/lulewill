package controle;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.IVeiculoDAO;
import modelo.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {

	private static ArrayList<Veiculo> tabelaVeiculos;
	private static VeiculoDAO instancia;
	private IVeiculoDAO veiculoDAO;

	private VeiculoDAO() {
	}

	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			tabelaVeiculos = new ArrayList<>();

			Veiculo BugattiChiron = new Veiculo();
			BugattiChiron.setNome("Bugatti Chiron");
			BugattiChiron.setAno(2012);
			BugattiChiron.setPreco(950.000);

			tabelaVeiculos.add(BugattiChiron);

			Veiculo BugattiVeyron = new Veiculo();
			BugattiVeyron.setNome("Bugatti Veyron");
			BugattiVeyron.setAno(2006);
			BugattiVeyron.setPreco(1.425000);
			BugattiVeyron.setPreco(1.425);

			tabelaVeiculos.add(BugattiVeyron);

			Veiculo BugattiCentodieci = new Veiculo();
			BugattiCentodieci.setNome("Bugatti Centodieci");
			BugattiCentodieci.setAno(2009);
			BugattiCentodieci.setPreco(1.840000);

			tabelaVeiculos.add(BugattiCentodieci);

			Veiculo BMWZ4 = new Veiculo();
			BMWZ4.setNome("BMW Z4");
			BMWZ4.setAno(2012);
			BMWZ4.setPreco(850.000);

			tabelaVeiculos.add(BMWZ4);

			Veiculo BMWSERIE4 = new Veiculo();
			BMWSERIE4.setNome("BMW SERIE 4");
			BMWSERIE4.setAno(2010);
			BMWSERIE4.setPreco(925.000);

			tabelaVeiculos.add(BMWSERIE4);

			Veiculo BMWX2 = new Veiculo();
			BMWX2.setNome("BMW X2");
			BMWX2.setAno(2015);
			BMWX2.setPreco(500.000);

			tabelaVeiculos.add(BMWX2);

			Veiculo GTRSupra = new Veiculo();
			GTRSupra.setNome("GTR Supra");
			GTRSupra.setAno(2020);
			GTRSupra.setPreco(1.000000);

			tabelaVeiculos.add(GTRSupra);

			Veiculo GTRR35 = new Veiculo();
			GTRR35.setNome("GTR r35");
			GTRR35.setAno(2021);
			GTRR35.setPreco(925.000);

			tabelaVeiculos.add(GTRR35);

			Veiculo GTRMax = new Veiculo();
			GTRMax.setNome("Fiat Mobi");
			GTRMax.setAno(2008);
			GTRMax.setPreco(1.500000);

			tabelaVeiculos.add(GTRMax);

			Veiculo FiatArgo = new Veiculo();
			FiatArgo.setNome("Fiat Argo");
			FiatArgo.setAno(2009);
			FiatArgo.setPreco(80.000);

			tabelaVeiculos.add(FiatArgo);

			Veiculo FiatDoblo = new Veiculo();
			FiatDoblo.setNome("Fiat Doblo");
			FiatDoblo.setAno(2008);
			FiatDoblo.setPreco(25.000);

			tabelaVeiculos.add(FiatDoblo);

			Veiculo FiatMobi = new Veiculo();
			FiatMobi.setNome("Fiat Mobi");
			FiatMobi.setAno(2008);
			FiatMobi.setPreco(90.000);

			tabelaVeiculos.add(FiatMobi);

		}

		return instancia;
	}

	@SuppressWarnings("resource")
	@Override
	public boolean inserir(Veiculo v) {
		
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
		
		return tabelaVeiculos.add(v);
	}

	@SuppressWarnings("resource")
	@Override
	public boolean alterar(Veiculo v) {
		
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
		
		return false;
	}

	@Override
	public boolean excluir(Veiculo v) {
		return tabelaVeiculos.remove(v);
	}

	@Override
	public ArrayList<Veiculo> listarVeiculos() {
		return tabelaVeiculos;

	}


	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static Veiculo get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
