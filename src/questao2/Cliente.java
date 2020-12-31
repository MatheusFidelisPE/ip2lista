package questao2;

public class Cliente extends Pessoa {
	
	private long codigo;
	
	public Cliente(String nome, String dataNascimento, long codigo) {
		super(nome, dataNascimento);
		this.codigo = codigo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		String parte1 = super.toString();
		return parte1 + String.format(" Código: %d", this.codigo);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
}
