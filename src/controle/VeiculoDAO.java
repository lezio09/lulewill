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
		
		
		return tabelaVeiculos.add(v);
	}

	@SuppressWarnings("resource")
	@Override
	public boolean alterar(Veiculo v) {
		
	
		
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
