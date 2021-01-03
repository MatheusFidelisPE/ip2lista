package questao3;

public class DespesaComInternet extends Despesa{

	private double dadosTrafegados;
	
	public DespesaComInternet(String data, String descricao, double dadosTrafegados) {
		super(data, descricao);
		this.dadosTrafegados = dadosTrafegados;
	}
	
	public double calcularTotal() {
		double valorTotal = 0;
		double dadosTrafegadosPerene = this.dadosTrafegados;
		if(dadosTrafegadosPerene >= 500) {
			valorTotal += (590 + (dadosTrafegadosPerene - 500)*5.1);
		}else if(dadosTrafegadosPerene > 20 && dadosTrafegadosPerene <= 100) {
			valorTotal += (240 + (dadosTrafegadosPerene - 100) * 4.4);
		}else if(dadosTrafegadosPerene <= 20) {
			valorTotal += (90.9 + (dadosTrafegadosPerene - 20)*3.9);
		}
		return valorTotal;
	}
}
