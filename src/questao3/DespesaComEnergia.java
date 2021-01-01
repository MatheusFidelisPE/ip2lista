package questao3;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa{

	private double kWh;
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
		double valorTotal;
		valorTotal = 0.5*kWh + (int)(kWh/100)*1.2;
		
		if(0 <= kWh && kWh < 50) {
			valorTotal += 2;
		}else if(kWh >= 50 && kWh < 200) {
			valorTotal += 15;
		}else if(kWh >= 200) {
			valorTotal += 35;
		}
		return valorTotal;
	}

}
