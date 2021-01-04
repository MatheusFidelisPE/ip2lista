package questao3;

public class LicencaPlus extends Receita{
	
	private int totalContas;
	
	LicencaPlus(String data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}
	
	public double calcularTotal() {
		return this.totalContas*150;
	}
}
