package questao3;

public class DespesaComAgua extends Despesa{

	private double totalM3;
	
	public DespesaComAgua(String data, String descricao, double totalM3) {
		super(data, descricao);
		this.totalM3 = totalM3;
	}

	public double calcularTotal() {
		double valorTotal = 0, totalM3Aduterado;
		totalM3Aduterado = totalM3;
		if(totalM3 >20) {
			totalM3Aduterado = totalM3 - (totalM3 - 20);
			valorTotal += (this.totalM3 - 20)*6 ;
		}
		if(totalM3Aduterado >= 10 && totalM3Aduterado <= 20) {
			valorTotal += ((totalM3Aduterado - 10)*5);
		}
		return valorTotal + 45;
	}
}
