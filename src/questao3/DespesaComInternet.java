package questao3;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa{

	private double dadosTrafegados;
	public LocalDateTime getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
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
