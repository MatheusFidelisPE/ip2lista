package questao3;

public class LicencaBasica extends Receita {

	private int totalContas;

	public LicencaBasica(String data, String descricao, int totalContas) {
		super(data, descricao);
		this.totalContas = totalContas;
	}

	public double calcularTotal() {
		return this.totalContas*20;
	}
}
