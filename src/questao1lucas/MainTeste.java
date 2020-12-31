package questao1lucas;

import java.util.Arrays;

public class MainTeste {

	public static void main(String[] args) {
		int tamanho = 7;

		

		BilheteDeLoteria bl = new BilheteDeLoteria(6);
		BilheteDeLoteria bl2 = new BilheteDeLoteria(6);
		MinhaLoteria ml = new MinhaLoteria(bl.numeros);
		System.out.println("Primeiro " + bl.toString());
		System.out.println("Segundo " + bl2.toString());

		System.out.println("Quantidades de valores comuns entre os dois bilhetes: " + bl2.qtdNumerosContidos(bl));
		ml.executaLoteria(bl.numeros, tamanho);

		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
				+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
				+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 6;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 8;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 9;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 10;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 11;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 12;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 13;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 14;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		tamanho = 15;
		ml.executaLoteria(bl.numeros, tamanho);
		System.out.println("Jogos de números " + tamanho + ": você apostou " + ml.retornaResultados()
		+ " vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + ml.retornaQuadra()
		+ " quadras e " + ml.retornaQuina() + " quinas.");
		
		

	}

}