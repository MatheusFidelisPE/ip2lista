package questao3;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita{
	
	private int totalContas;
	
	public LocalDateTime getData() {
		return null;
	}

	public String getDescricao() {
		return "Licença plus";
	}
	
	public double calcularTotal() {
		return this.totalContas*150;
	}
	

}
