package questao3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Despesa implements Transacao {
	
	protected LocalDateTime data; 
	private String descricao;
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
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
	
}
