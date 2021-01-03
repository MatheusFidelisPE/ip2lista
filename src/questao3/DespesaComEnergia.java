package questao3;

public class DespesaComEnergia extends Despesa{

	private double kWh;

	public DespesaComEnergia(String data, String descricao, double kWh ) {
		super(data, descricao);
		this.kWh = kWh;
	}

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
