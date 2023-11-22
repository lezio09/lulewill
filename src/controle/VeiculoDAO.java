package controle;

import java.util.ArrayList;

import modelo.IVeiculoDAO;
import modelo.Veiculo;

public class VeiculoDAO implements IVeiculoDAO {
	
	private static ArrayList<Veiculo> tabelaVeiculos;
	private static VeiculoDAO instancia;

	
	private VeiculoDAO() {
	}

	public static VeiculoDAO getInstancia() {

		if (instancia == null) {
			instancia = new VeiculoDAO();
			tabelaVeiculos = new ArrayList<>();
			
			Veiculo bug = new Veiculo();
			bug.setNome("Bugatti Chiron");
			bug.setAno(2012);
			bug.setPreco(950.000);
			
			tabelaVeiculos.add(bug);
			
			Veiculo bug2 = new Veiculo();
			bug2.setNome("Bugatti Veyron");
			bug2.setAno(2006);
			bug2.setPreco(1.425000);
			
			tabelaVeiculos.add(bug2);
		
			Veiculo bug3 = new Veiculo();
			bug3.setNome("Bugatti Centodieci");
			bug3.setAno(2009);
			bug3.setPreco(1.840000);
			
			tabelaVeiculos.add(bug3);
		
		
			Veiculo bmw1 = new Veiculo();
			bmw1.setNome("BMW Z4");
			bmw1.setAno(2012);
			bmw1.setPreco(850.000);
			
			tabelaVeiculos.add(bmw1);
			
			
			Veiculo bmw2 = new Veiculo();
			bmw2.setNome("BMW SERIE 4");
			bmw2.setAno(2010);
			bmw2.setPreco(925.000);
			
			tabelaVeiculos.add(bmw2);
			
			Veiculo bmw3 = new Veiculo();
			bmw3.setNome("BMW X2");
			bmw3.setAno(2015);
			bmw3.setPreco(500.000);
			
			tabelaVeiculos.add(bmw3);
			
		
		}

		return instancia;
	}

	@Override
	public boolean inserir(Veiculo v) {
		return tabelaVeiculos.add(v);
	}

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
}
