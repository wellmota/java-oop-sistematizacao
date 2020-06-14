public class Cliente extends Pessoa {
	
	private Produto produtoComprado;
	private int codigoCliente;
	
	public Cliente() {
		codigoCliente = -1;
	}
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public void compra(Produto novoProduto) {
		produtoComprado = novoProduto;
		
	}
	
	public String mostraProdutoComprado() {
		return "Cliente " + this.getNome() + 
				" comprou: " + this.produtoComprado.getNome() +
				" com: " + this.produtoComprado.getQuantidade() + " unidades.";
		
	}
	

}
