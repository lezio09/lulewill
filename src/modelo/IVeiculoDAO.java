package modelo;

import java.util.ArrayList;

public interface IVeiculoDAO {
	public boolean inserir(Veiculo v);

	public boolean alterar(Veiculo v );

	public boolean excluir(Veiculo v );
	
	public ArrayList<Veiculo> listarVeiculos();

}


