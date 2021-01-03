package questao3;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita {

	private int totalContas;

	public LocalDateTime getData() {
		return null;
	}

	public String getDescricao() {
		return "Licença Básica";
	}

	public double calcularTotal() {
		return this.totalContas*20;
	}
	
}
