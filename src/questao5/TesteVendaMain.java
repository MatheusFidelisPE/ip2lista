package questao5;

public class TesteVendaMain {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Produto 01", 10);
		Produto p2 = new Produto("Produto 02", 5);
		Produto p3 = new Produto("Produto 03", 20);
		Produto p4 = new Produto("Produto 04", 15);
		
		ItemVenda item1 = new ItemVenda(p1,10);
		ItemVenda item2 = new ItemVenda(p2,5);
		ItemVenda item3 = new ItemVenda(p3,10);
		ItemVenda item4 = new ItemVenda(p4,2);
		
		Cliente cliente1 = new Cliente("Matheus Fidelis","706.285.664-92","05/04/2000");
		
		
		Venda venda1 = new Venda(cliente1, "Jessica Silveira Costa");
		
		venda1.adicionarItem(item1);
		venda1.adicionarItem(item2);
		venda1.adicionarItem(item3);
		venda1.adicionarItem(item4);
		
		venda1.listarItensVenda();
		
		
	}

}
