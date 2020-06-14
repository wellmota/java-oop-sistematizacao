

public class Pessoa {
	
	private String nome;
	private Telefone telefone;
	
	//Construtor
	public Pessoa() {
		telefone = new Telefone();
		
	}
	
	
	//Metodos Especiais

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	
	

}
