package questao1;

import java.util.Random;

public class BilheteDeLoteria {
	
	Random gerador = new Random();
	private int bilhetesNumeros[];
	
	public BilheteDeLoteria(int tamanho) {
		construirBilhete(tamanho);
	}
	
	public void construirBilhete(int tamanho) {
		this.bilhetesNumeros = new int[tamanho];
		for(int contador = 0; contador < tamanho; contador++) {
			int randomNum = 0;
			boolean numeroAdicionado = true;
			do{
				numeroAdicionado = true;
				randomNum = 1 + gerador.nextInt(60);
				for(int contadorBilhete = 0; contadorBilhete < contador; contadorBilhete++) {
					if(randomNum == this.bilhetesNumeros[contadorBilhete]) {
						numeroAdicionado = false ;
						break;
					}
				}
			}while(!numeroAdicionado); 
			bilhetesNumeros[contador] = randomNum;
		}
	}
	
	public int qtdNumerosContidos(BilheteDeLoteria bilheteParaTestar) {
		int contidoNosDois = 0;
		for(int contadorVarredura = 0; contadorVarredura < bilheteParaTestar.bilhetesNumeros.length; contadorVarredura++) {
			for(int contadorVarreduraPremiado = 0; contadorVarreduraPremiado < this.bilhetesNumeros.length; contadorVarreduraPremiado++) {
				if(this.bilhetesNumeros[contadorVarreduraPremiado] == bilheteParaTestar.bilhetesNumeros[contadorVarredura]) {
					contidoNosDois++;
					break;
				}
			}
		}
		return contidoNosDois;
	}
	
	
	public String toString() {
		return super.toString();
	}

	public String getNumerosBilhete() {
		String bilhete = "[";
		for(int num : this.bilhetesNumeros) {
			bilhete = bilhete + " " + num;
		}
		bilhete = bilhete + " ]";
		return bilhete;
	}

	public void setBilhetesNumeros() {
		this.bilhetesNumeros = null;
	}
	
	
	
}
