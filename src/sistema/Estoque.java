package sistema;

public class Estoque {
	
	private Produto produto;
	private int qteAtual;
	private int qteMin;
	
	Estoque(){
		this(new Produto(), 0, 0);
	}
	Estoque(Produto produto, int qteAtual, int qteMin){
		this.produto = produto;
		this.qteAtual = qteAtual;
		this.qteMin = qteMin;
	}
	void mudarQtdMinima(int qtdMinima) {
		this.qteMin += qtdMinima;
	}
	
	void reporEstoque(int soma) {
		this.qteAtual += soma;
	}
	
	void darBaixa(int subtrair) {
		if(this.qteMin <= this.qteAtual - subtrair) {
			this.qteAtual -= subtrair;
		}else {
			System.out.printf("Imposs�vel retirar  esta quantidade. Retire at� %d unidades.\n", qteAtual - qteMin);
		}
	}
	
	public int getQteAtual() {
		return this.qteAtual;
	}
	private int getQteMin() {
		return this.qteMin;
	}
	String relatorio() {
		return String.format("%s\nQuantidade atual Estoque: %d\nQuantidade M�nima: %d", this.produto, getQteAtual(), getQteMin());
	}
	
}
