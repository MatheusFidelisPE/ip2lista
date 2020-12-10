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
	void reporEstoque(int soma) {
		this.qteAtual += soma;
	}
	void darBaixa(int subtrair) {
		this.qteAtual -= subtrair;
	}
	private int getQteAtual() {
		return this.qteAtual;
	}
	private int getQteMin() {
		return this.qteMin;
	}
	String relatorio() {
		return String.format("%s\nQuantidade atual Estoque: %d\nQuantidade Mínima: %d", this.produto, getQteAtual(), getQteMin());
	}
	
}
