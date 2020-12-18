package questao5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Venda {
	LocalDateTime data;
	String atendente;
	Cliente clienteDono;
	ArrayList<ItemVenda> itens = new ArrayList<>();
	DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	Venda(Cliente cliente){
		this.data = LocalDateTime.now();
		this.atendente = "Jéssica Maria Sampaio Silveira";
		this.clienteDono = cliente;
		
	}
	public Cliente getClienteDono() {
		return clienteDono;
	}
	public void setClienteDono(Cliente clienteDono) {
		this.clienteDono = clienteDono;
	}
	void adicionarItem(ItemVenda item) {
		itens.add(item);
	}	
	public LocalDateTime getData() {
		return data;
	}
	double calcularTotal() {
		double soma = 0;
		for (ItemVenda itemVenda : itens) {
			soma += itemVenda.calcularTotal();
		}
		return soma;
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

	void listarItensVenda() {
		System.out.printf("Data da venda: %s\nCliente: %s | CPF: %s | Idade: %d\nAtendente: %s\n\nNome do Produto | Preço    | Quantidade | Total   ", 
				data.format(formatador),
				clienteDono.getNome(),
				clienteDono.getCpf(),
				clienteDono.calcularIdade(),
				atendente);
		System.out.println("\n-------------------------------------------------");
		for (ItemVenda itemVenda : itens) {
			System.out.printf("%-16s| R$ %6.2f| %11d| R$%6.2f ", itemVenda.produto.getNome(), itemVenda.produto.getPreco(),itemVenda.quantidade, itemVenda.calcularTotal());
		}
		
	}
}
