package questao5;

public class Execucao {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("farinha", 3.5);
		ItemVenda item = new ItemVenda(produto1, 10);
		Cliente cliente1 = new Cliente();
		cliente1.setDataNascimento("05/04/2000");
		cliente1.setCpf("706.285.664-92");
		cliente1.setNome("Matheus Fidelis");
		System.out.println(cliente1.calcularIdade());
		
		Venda venda1 = new Venda(cliente1);
		venda1.adicionarItem(item);
		venda1.listarItensVenda();
		
	}

}
