package questao1;

import java.util.ArrayList;
import java.util.Random;

public class BilheteDeLoteria {
	
	Random gerador = new Random();
	private ArrayList<Integer> numerosBilhete = new ArrayList<Integer>();
	
	public BilheteDeLoteria(int tamanho) {
		construirBilhete(tamanho);
		
	}
	
	void construirBilhete(int tamanho) {
		for(int contador = 0; contador < tamanho; contador++) {
			int num = 1 + gerador.nextInt(59);
			while(numerosBilhete.contains(num)) {
				num = gerador.nextInt(59) + 1;
			}
			numerosBilhete.add(num);
		}
		numerosBilhete.sort(null);
	}
	int qtdNumerosContidos(BilheteDeLoteria bilheteParatestar) {
		int contidoNosDois = 0;
		for(Integer numeroApostado : bilheteParatestar.numerosBilhete) {
			if(this.numerosBilhete.contains(numeroApostado)) {
				contidoNosDois++;
			}
		}
		return contidoNosDois;
	}
	public ArrayList<Integer> getNumerosBilhete() {
		return numerosBilhete;
	}
}
