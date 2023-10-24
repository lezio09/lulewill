package lulewill;

class Veiculo {
    private String modelo;
    private String ano;
    private String nome;

    public Veiculo(String nome, String modelo, String ano) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
  
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
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
        return "Nome: " + nome + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}
