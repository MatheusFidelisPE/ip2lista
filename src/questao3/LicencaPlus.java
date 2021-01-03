package questao3;

public class LicencaPlus extends Receita{
	
	private int totalContas;
	
	LicencaPlus(String data, String descricao, int totalContas) {
		super(data, descricao);
		this.descricao = descricao;		
	}
	
	public double calcularTotal() {
		return this.totalContas*150;
	}
}
