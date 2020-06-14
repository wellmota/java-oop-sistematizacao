

public class Vendedor extends Pessoa {
	//ATRIBUTOS
	private Estoque estoqueAtual;
	private int codigoFuncionario;

	 
	//CONSTRUTORES
	public Vendedor() {
		codigoFuncionario = -1;
	}
	
	public Vendedor(Estoque novoEstoque){
		codigoFuncionario = -1;
		this.estoqueAtual = novoEstoque;
		
	}

	// MÉTODOS ESPECIAIS
	
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	
	

	// MÉTODOS ABSTRATOS
	
	public Estoque getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(Estoque estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public void recebeEstoqueAtual(Estoque estoque) {
		this.estoqueAtual = estoque;
	}
	
	public boolean confereDisponibilidade(String nomeProduto, int quantidade) {
		if(estoqueAtual.buscaProdutoPorNome(nomeProduto) == null) {
			return false;
		} else {
			if(estoqueAtual.buscaProdutoPorNome(nomeProduto).getQuantidade() >= quantidade){
			return true;}
		}
		return false; 	
	}
	
	public Produto vendeProduto(String nomeProduto, int quantidade) {
		Produto produto = estoqueAtual.buscaProdutoPorNome(nomeProduto);
		Produto saida = new Produto(nomeProduto, quantidade);
		saida.setQuantidade(quantidade);
		produto.setQuantidade(produto.getQuantidade() - 1);
		return saida;
	}

	
	
	
	
	

	
	
	
	

}
