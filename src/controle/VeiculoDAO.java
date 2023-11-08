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
