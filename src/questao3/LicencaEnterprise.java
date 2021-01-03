package questao3;

public class LicencaEnterprise extends Receita{

	private int totalContas;
	
	public LicencaEnterprise(String data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}
	
	public double calcularTotal() {
		return this.totalContas*35;
	}
}
