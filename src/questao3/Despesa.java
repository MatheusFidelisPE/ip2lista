package questao3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Despesa implements Transacao {
	
	protected LocalDateTime data; 
	private String descricao;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	Despesa(String data, String descricao){
		this.data = LocalDateTime.parse(data, formatador);
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public String getTipo() {
		return "DESPESA";
	}
	public LocalDateTime getData() {
		return this.data;
	}
	
	public abstract double calcularTotal();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Despesa other = (Despesa) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}
