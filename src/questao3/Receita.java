package questao3;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao {
	
	LocalDateTime data;
	String descricao;
	
	public String getTipo() {
		return "RECEITA";
	}
	public abstract double calcularTotal();
	
	
}
