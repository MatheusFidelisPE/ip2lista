package questao5;

public class ItemVenda {

	int quantidade;
	Produto produto;
	double calcularTotal() {
		return produto.getPreco() * quantidade;
	}
}
