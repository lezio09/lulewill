package controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.IVeiculoDAO;
import modelo.Veiculo;

@SuppressWarnings("unused")
public class VeiculoDAO implements IVeiculoDAO {

	private static ArrayList<Veiculo> tabelaVeiculos;
	private static VeiculoDAO instancia;
    private static ArrayList<Veiculo> carrinho;
	private IVeiculoDAO veiculoDAO;

	 // Construtor privado para garantir que a classe seja um Singleton
	private VeiculoDAO() {
		 tabelaVeiculos = new ArrayList<>();
	     carrinho = new ArrayList<>();
	}
	 // Método para obter a instância única da classe (Singleton)
	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			tabelaVeiculos = new ArrayList<>();
			
			 // Adiciona alguns veículos à tabelaVeiculos para fins de exemplo
			Veiculo BugattiChiron = new Veiculo();
			BugattiChiron.setNome("Bugatti Chiron");
			BugattiChiron.setAno(2012l);
			BugattiChiron.setPreco(950.000);

			tabelaVeiculos.add(BugattiChiron);

			Veiculo BugattiVeyron = new Veiculo();
			BugattiVeyron.setNome("Bugatti Veyron");
			BugattiVeyron.setAno(2006l);
			BugattiVeyron.setPreco(1.425000);
			BugattiVeyron.setPreco(1.425);

			tabelaVeiculos.add(BugattiVeyron);

			Veiculo BugattiCentodieci = new Veiculo();
			BugattiCentodieci.setNome("Bugatti Centodieci");
			BugattiCentodieci.setAno(2009l);
			BugattiCentodieci.setPreco(1.840000);

			tabelaVeiculos.add(BugattiCentodieci);

			Veiculo BMWZ4 = new Veiculo();
			BMWZ4.setNome("BMW Z4");
			BMWZ4.setAno(2012l);
			BMWZ4.setPreco(850.000);

			tabelaVeiculos.add(BMWZ4);

			Veiculo BMWSERIE4 = new Veiculo();
			BMWSERIE4.setNome("BMW SERIE 4");
			BMWSERIE4.setAno(2010l);
			BMWSERIE4.setPreco(925.000);

			tabelaVeiculos.add(BMWSERIE4);

			Veiculo BMWX2 = new Veiculo();
			BMWX2.setNome("BMW X2");
			BMWX2.setAno(2015l);
			BMWX2.setPreco(500.000);

			tabelaVeiculos.add(BMWX2);

			Veiculo GTRSupra = new Veiculo();
			GTRSupra.setNome("GTR Supra");
			GTRSupra.setAno(2020l);
			GTRSupra.setPreco(1.000000);

			tabelaVeiculos.add(GTRSupra);

			Veiculo GTRR35 = new Veiculo();
			GTRR35.setNome("GTR r35");
			GTRR35.setAno(2021l);
			GTRR35.setPreco(925.000);

			tabelaVeiculos.add(GTRR35);

			Veiculo GTRMax = new Veiculo();
			GTRMax.setNome("Fiat Mobi");
			GTRMax.setAno(2008l);
			GTRMax.setPreco(1.500000);

			tabelaVeiculos.add(GTRMax);

			Veiculo FiatArgo = new Veiculo();
			FiatArgo.setNome("Fiat Argo");
			FiatArgo.setAno(2009l);
			FiatArgo.setPreco(80.000);

			tabelaVeiculos.add(FiatArgo);

			Veiculo FiatDoblo = new Veiculo();
			FiatDoblo.setNome("Fiat Doblo");
			FiatDoblo.setAno(2008l);
			FiatDoblo.setPreco(25.000);

			tabelaVeiculos.add(FiatDoblo);

			Veiculo FiatMobi = new Veiculo();
			FiatMobi.setNome("Fiat Mobi");
			FiatMobi.setAno(2008l);
			FiatMobi.setPreco(90.000);

			tabelaVeiculos.add(FiatMobi);

		}

		return instancia;
	}

	@SuppressWarnings("resource")
	@Override
	public boolean inserir(Veiculo v) {
				
		 boolean inserido = tabelaVeiculos.add(v);
	        if (inserido) {
	            carrinho.add(v);
	            System.out.println("Veículo adicionado ao carrinho.");
	        } else {
	            System.out.println("Erro ao adicionar veículo ao carrinho.");
	        }
	        return inserido;
	    
		
	}

	
	@Override
	
	// Aqui você pode implementar a lógica para alterar bum veículo
    // Por exemplo, você pode exibir a lista de veículos e permitir ao usuário escolher um para alterar
	public boolean alterar(Veiculo v) {
		
		
		ArrayList<Veiculo> veiculos = veiculoDAO.listarVeiculos();

		System.out.println("----- MENU ALTERAR VEÍCULO CADASTRADO -----");
		System.out.println("Digite o número do veículo que deseja alterar:");
		for (int i = 0; i < veiculos.size(); i++) {
			System.out.println(i + " - " + veiculos.get(i).getNome());
		}
		
		
		return true;
	}

	@Override
	// Aqui você pode implementar a lógica para excluir um veículo
    // Por exemplo, você pode exibir o carrinho e permitir ao usuário escolher um para remover
	public boolean excluir(Veiculo v) {
		
		System.out.println("----- REMOVER DO CARRINHO -----");
        veiculoDAO.visualizarCarrinho();

        System.out.print("Digite o número do veículo que deseja remover do carrinho: ");
       

        @SuppressWarnings("null")
		int indice = (Integer) null;
		if (indice >= 0 && indice < veiculoDAO.listarVeiculos().size()) {
            Veiculo veiculoRemover = veiculoDAO.listarVeiculos().get(indice);
            if (veiculoDAO.removerDoCarrinho(veiculoRemover)) {
                System.out.println("Veículo removido do carrinho com sucesso!");
            } else {
                System.out.println("Erro ao remover veículo do carrinho.");
            }
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
    

		
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

	@Override
	public void visualizarCarrinho() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removerDoCarrinho(Veiculo veiculoRemover) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
