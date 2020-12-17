package questao5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Venda {
	LocalDateTime data;
	String atendente;
	Cliente clienteDono;
	ArrayList<ItemVenda> itens = new ArrayList<>();
	
	
	void adicionarItem(ItemVenda item) {
		itens.add(item);
	}	
	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getAtendente() {
		return atendente;
	}

	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}

	double calcularTotal() {
		double soma = 0;
		for (ItemVenda itemVenda : itens) {
			soma += itemVenda.calcularTotal();
		}
		return soma;
	}
	
	void listarItensVenda() {
		
	}
}
