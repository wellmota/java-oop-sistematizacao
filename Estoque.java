import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Produto> produtos;
	public Estoque() {
		produtos = new ArrayList<Produto>();
	}
	 
	public void adicionarProduto(Produto nomeProduto) {
		if(this.buscaProdutoPorNome(nomeProduto.getNome() ) == null)
		produtos.add(nomeProduto); 
	}
	
	public Produto buscaProdutoPorNome(String nomeProduto) {
		
		for(int i = 0; i < produtos.size(); i++) {
			
			if(produtos.get(i).getNome().equals(nomeProduto)){
				return produtos.get(i);
			}
		}
		
		return null;
		
	}

	@Override
	public String toString() {
		return "Estoque [produtos=" + produtos + "]";
	}
	
	
	
}
