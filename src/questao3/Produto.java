package questao3;

public class Produto {
	
	final static String nomeVazio = "Sem Nome";
	final static String codigoVazio = "Sem Código";
	
	private String nome;
	private String codigo;
	
	Produto() {
		this(nomeVazio, codigoVazio);
	}
	Produto(String nome, String codigo) {
		setNome(nome);
	    setCodigo(codigo);
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}

	private void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return String.format("%s --- %s", this.nome, this.codigo);
	}
}
