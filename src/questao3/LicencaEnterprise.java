package questao3;

import java.time.LocalDateTime;

public class LicencaEnterprise extends Receita{

	private int totalContas;
	
	public LocalDateTime getData() {
		return null;
	}

	public String getDescricao() {
		return "Licença Enterprise";
	}

	public double calcularTotal() {
		return this.totalContas*35;
	}

}
