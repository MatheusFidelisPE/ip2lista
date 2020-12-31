package questao3;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao {
	
	LocalDateTime data;
	String descricao;
	
	public abstract String getTipo();
	public abstract double calcularTotal();
	
	
}
