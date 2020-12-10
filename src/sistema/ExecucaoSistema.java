package sistema;

import java.util.Arrays;
import java.util.List;

public class ExecucaoSistema {

	public static void main(String[] args) {
		Produto p1 = new Produto("Teclado", "1");
		Produto p2 = new Produto("Mouse", "2");
		
		Estoque e1 = new Estoque(p1, 20, 15);
		Estoque e2 = new Estoque(p2, 30, 10);
		
		e1.darBaixa(5);
		e2.reporEstoque(19);
		
		System.out.println(e1.relatorio());
		System.out.println(e2.relatorio());
		
		p1.setNome("Teclado Virtual");
		System.out.println(e1.relatorio());
		System.out.println(e2.relatorio());
		
		
	}
}
