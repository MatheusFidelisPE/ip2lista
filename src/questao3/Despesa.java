package questao3;

import java.time.LocalDateTime;

public abstract class Despesa implements Transacao {
	
	private LocalDateTime data; 
	private String descricao;
	
	public abstract String getTipo();
	public abstract double calcularTotal();
	
}
