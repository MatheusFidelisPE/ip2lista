package questao5;

public class Produto {
	
	int codigo;
	private String nome;
	String descricao;
	private double preco;
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}
	

}