package questao5;

public class ItemVenda {

	private int quantidade;
	private Produto produto;
	
	ItemVenda(Produto produto, int quantidade){
		setProduto(produto);
		this.quantidade = quantidade;
	}
	double calcularTotal() {
		return produto.getPreco() * quantidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
