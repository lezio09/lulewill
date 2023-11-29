package modelo;

public class Veiculo {
	private String modelo;
	private long ano;
	private String nome;
	private Double preco;

	// Constructor que permite inicializar todos os atributos
	public Veiculo(String nome, String modelo, Integer ano, Double preco) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	
		}

	// Construtor padrão vazio
	public Veiculo() {
		// TODO Auto-generated constructor stub
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public long getAno() {
		return ano;
	}

	public void setAno(long ano) {
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome.toUpperCase() + " " + modelo.toUpperCase() + " " + ano  + " PREÇO: R$ " + preco;
	}

	public void setAno(int novoAno) {
		// TODO Auto-generated method stub
		
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
