import javax.swing.JOptionPane;

public class Sistematizacao {
	public static void main(String[] args) {
		
		// CRIA UM NOVO ESTOQUE CHAMADO:estoque
				Estoque estoque = new Estoque();
				
				// ADICIONA PRODUTOS AO ESTOQUE DE NOME:estoque
				estoque.adicionarProduto(new Produto("Camiseta", 200));
				estoque.adicionarProduto(new Produto("Sapato", 200));
				estoque.adicionarProduto(new Produto("Tenis", 200));
				estoque.adicionarProduto(new Produto("Calça", 200));
				
				//DESCREVE O estoque
					// System.out.println(estoque.toString());
				
				//PESQUISA POR PRODUTO NO ESTOQUE
				//Produto produto = estoque.buscaProdutoPorNome("Tenis");
				//
				//if(produto != null){
		 		//	System.out.println("Produto encontrado: " + produto.getNome() + ", com quantidade:" + produto.getQuantidade());
				// } else {
				//  System.out.println("Produto não encontrado");
				//}
		
		// CRIA UM NOVO CLIENTE
		Cliente cliente = new Cliente();
		Telefone c1 = new Telefone("(61)", "98104-3296");
		cliente.setNome("Wellington Oliveira da Mota");
		cliente.setTelefone(c1);
		
		// CRIA UM NOVO VENDEDOR
		Vendedor vendedor = new Vendedor();
		Telefone c2 = new Telefone("(61)","99885-4321");
		vendedor.setNome("Maria");
		vendedor.setTelefone(c2);
		vendedor.setEstoqueAtual(estoque);
		
		// SIMULAÇÃO DE VENDA
		String p1 = JOptionPane.showInputDialog("Informe o nome do produto");
		int qtd1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		if(vendedor.confereDisponibilidade(p1, qtd1)) {
			cliente.compra(vendedor.vendeProduto(p1, qtd1));
			System.out.println("Nome do vendedor: "+ vendedor.getNome() 
			+ "\n" + cliente.mostraProdutoComprado());
		}else {
			System.out.println("Venda não pode ser realizada, produtos indisponíveis.");
		}
		
	
	}
}
