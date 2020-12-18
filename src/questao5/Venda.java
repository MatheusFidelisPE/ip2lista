package questao5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class Venda {
	LocalDateTime data;
	String atendente;
	Cliente clienteDono;
	ArrayList<ItemVenda> itens = new ArrayList<>();
	DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm");
	
	Venda(Cliente cliente, String atendente){
		this.data = LocalDateTime.now();
		this.atendente = atendente;
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
	String calcularTotal() {
		double soma = 0;
		for (ItemVenda itemVenda : itens) {
			soma += itemVenda.calcularTotal();
		}
		return String.format("R$ %.2f", soma);
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
		System.out.printf(Locale.ITALY,"Data da venda: %s      Hora: %s\nCliente: %s | CPF: %s | Idade: %d\nAtendente: %s\n\nNome do Produto | Preço    | Quantidade | Total   ", 
				data.format(formatadorData),
				data.format(formatadorHora),
				clienteDono.getNome(),
				clienteDono.getCpf(),
				clienteDono.calcularIdade(),
				atendente);
		System.out.println("\n--------------------------------------------------");
		for (ItemVenda itemVenda : itens) {
			System.out.printf("%-16s| R$ %6.2f| %11d| R$%6.2f \n", itemVenda.getProduto().getNome(), itemVenda.getProduto().getPreco(),itemVenda.getQuantidade(), itemVenda.calcularTotal());
		}
		System.out.printf("--------------------------------------------------\nTotal da Venda: %34s", calcularTotal());
	}
}
