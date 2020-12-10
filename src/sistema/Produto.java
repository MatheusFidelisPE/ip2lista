package sistema;

public class Produto {
	
	final static String nomeVazio = "Sem Nome";
	final static String codigoVazio = "Sem Código";
	
	String nome;
	String codigo;
	
	Produto() {
		this(nomeVazio, codigoVazio);
	}
	Produto(String nome, String codigo) {
		setNome(nome);
	    setCodigo(codigo);
	}
	
	private void setNome(String nome) {
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
