package sistema;

import java.util.Arrays;
import java.util.List;

public class ExecucaoSistema {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto("Farinha", "12345");
		Produto p3 = new Produto();
		Produto p4 = new Produto("Fejão", "334455");
		Produto p5 = new Produto("Sandália", "445566");
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.stream().forEach(System.out::println);
	}
}
