

public class Produto {
	
	private String nome;
	private int quantidade;
	
	//Construtor

	public Produto(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	} 
	
	//Metodos especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", quantidade=" + quantidade + "]";
	}
	
	

	
	

}
