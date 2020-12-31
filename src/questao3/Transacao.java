package questao3;

import java.time.LocalDateTime;

public interface Transacao {

	LocalDateTime getData();
	String getTipo();
	String getDescricao();
	double calcularTotal();
	
}
