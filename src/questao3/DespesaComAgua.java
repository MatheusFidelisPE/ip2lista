package questao3;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa{

	private double totalM3;
	
	@Override
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
		double valorTotal = 0, totalM3Aduterado;
		totalM3Aduterado = totalM3;
		if(totalM3 >20) {
			totalM3Aduterado = totalM3 - (totalM3 - 20);
			valorTotal += (this.totalM3 - 20)*6 ;
		}
		else if(totalM3Aduterado >= 10 && totalM3Aduterado <= 20) {
			valorTotal += ((totalM3Aduterado - 10)*5);
			return valorTotal;
		}
		
		return valorTotal + 45;
	}

}
