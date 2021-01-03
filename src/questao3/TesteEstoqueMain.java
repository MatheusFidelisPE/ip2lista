package questao3;

public class TesteEstoqueMain {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Teclado", "1");
		Produto produto2 = new Produto("Mouse", "2");
		
		Estoque estoque1 = new Estoque(produto1, 20, 15);
		Estoque estoque2 = new Estoque(produto2, 30, 10);
		
		estoque1.darBaixa(10);
		estoque2.reporEstoque(19);
		
		System.out.println(estoque1.relatorio());
		System.out.println(estoque2.relatorio());
		
		produto1.setNome("Teclado Virtual");
		System.out.println(estoque1.relatorio());
		System.out.println(estoque2.relatorio());
		
		
	}
}
