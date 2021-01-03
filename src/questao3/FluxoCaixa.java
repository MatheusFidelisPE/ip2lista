package questao3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FluxoCaixa {
	
	private String nomeEmpresa;
	private String cnpj;
	
	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
	
	FluxoCaixa(String nomeEmpresa, String cnpj) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
	}
	
	public void adicionarTransacao(Transacao transacao) {
		boolean adicionarTransacao = true;
		for(Transacao trans : transacoes) {
			if(trans.equals(transacao)) {
				adicionarTransacao = false;
				break;
			}
		}
		if(adicionarTransacao) {
			transacoes.add(transacao);
		}
	}
	
	public double calcularDespesas(LocalDate inicio, LocalDate fim) {
		double somaTotalDespesas = 0;
		for(Transacao trans : transacoes) {
			if(trans.getTipo().equals("DESPESA") && trans.getData().isAfter(inicio.atStartOfDay()) && trans.getData().isBefore(fim.atStartOfDay())) {
				somaTotalDespesas += trans.calcularTotal();				
			}
		}
		return somaTotalDespesas;
	}
	
	public double calcularReceitas(LocalDate inicio, LocalDate fim) {
		double somaTotalReceitas = 0;
		
		for(Transacao trans : this.transacoes) {
			if(trans.getTipo().equals("RECEITA") && trans.getData().isAfter(inicio.atStartOfDay()) && trans.getData().isBefore(fim.atStartOfDay())) {
				somaTotalReceitas += trans.calcularTotal();
			}
		}
		return somaTotalReceitas;
	}
	
	public double percentualReceitasNoMes(int mes, int ano) {
		
		return 0.0;
	}
	
	public double percentualDespesasNoMes(int mes, int ano) {
		return 0.0;
	}
	
	public double saldoAtual() {
		return 0.0;
	}
	
	public List<Transacao> listarTransacoesNoMes(int mes, int ano ){
		return null;
	}  
	
	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}
