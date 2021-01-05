package questao1;

import java.util.ArrayList;

public class MinhaLoteria {

	public static void main(String[] args) {
		
		final BilheteDeLoteria bilhetePremiado = new BilheteDeLoteria(6);
		
		ArrayList<Integer> valoresDoNumeroDeApostas = new ArrayList<Integer>();
		ArrayList<Integer> valoresQuadras = new ArrayList<Integer>();
		ArrayList<Integer> valoresQuinas = new ArrayList<Integer>();
		ArrayList<BilheteDeLoteria> bilhetes = new ArrayList<BilheteDeLoteria>();
		
		System.out.println("Inicio do programa\nBilhete Premiado: " + bilhetePremiado.getBilhetesNumeros());
		
		for(int NumPorBilhete = 6; NumPorBilhete < 16; NumPorBilhete++ ) {
			BilheteDeLoteria bilheteDeAposta = new BilheteDeLoteria(NumPorBilhete);
			
			int qteBilhetesCriados = 0;
			int quina = 0, quadra = 0;
			
			while(bilhetePremiado.qtdNumerosContidos(bilheteDeAposta) != 6) {
				try {
				bilhetes.add(bilheteDeAposta);
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				bilheteDeAposta.setBilhetesNumeros();
				bilheteDeAposta.construirBilhete(NumPorBilhete);
				qteBilhetesCriados++;
				
				if(bilhetePremiado.qtdNumerosContidos(bilheteDeAposta) == 4) {
					quadra++;
				}
				else if(bilhetePremiado.qtdNumerosContidos(bilheteDeAposta) == 5) {
					quina++;
				}
			}
			// Adicionando valores em um arraylist para impressão apenas no fim do processo.
			valoresDoNumeroDeApostas.add(qteBilhetesCriados);
			valoresQuadras.add(quadra);
			valoresQuinas.add(quina);
		}
		System.out.println(bilhetes.get(bilhetes.size()-1));
		// Formatando impressão aos moldes do que foi pedido na questão.
		for(int i = 0; i < 10 ; i++) {
			System.out.println("* Jogo de " + (i+6) + "  números: você apostou " + valoresDoNumeroDeApostas.get(i) + 
					" vezes para ganhar na mega-sena. Dentre esses jogos, você acertou " + valoresQuadras.get(i) + " quadras e " + valoresQuinas.get(i) + " quinas." );
		}
	}
}
