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
		double somaPercentualReceitas = 0;
		double somaTotalAno = 0;
		
		for(Transacao transReceita : transacoes) {
			if(transReceita.getTipo().equals("RECEITA") && transReceita.getData().getYear() == ano) {
				somaTotalAno += transReceita.calcularTotal();
			}
		}
		
		for(Transacao trans : this.transacoes) {
			if(trans.getData().getMonthValue() == mes && trans.getData().getYear() == ano && trans.getTipo().equals("RECEITA")) {
				somaPercentualReceitas += trans.calcularTotal();
			}
		}
		return (somaPercentualReceitas*100)/somaTotalAno;
	}
	
	public double percentualDespesasNoMes(int mes, int ano) {
		double somaPercentualDespesas = 0;
		double somaTotalAno = 0;
		
		for(Transacao transDespesas : this.transacoes) {
			if(transDespesas.getTipo().equals("DESPESA") && transDespesas.getData().getYear() == ano) {
				somaTotalAno += transDespesas.calcularTotal();
			}
		}
		for(Transacao trans : this.transacoes) {
			if(trans.getData().getMonthValue() == mes && trans.getData().getYear() == ano) {
				somaPercentualDespesas += trans.calcularTotal();
			}
		}
		return (somaPercentualDespesas*100)/somaTotalAno;
	}
	
	public double saldoAtual() {
		double resultadoSaldo = 0;
		
		for(Transacao trans : this.transacoes) {
			if(trans.getTipo().equals("RECEITA")) {
				resultadoSaldo += trans.calcularTotal();
			}
			else if(trans.getTipo().equals("DESPESA")) {
				resultadoSaldo -= trans.calcularTotal();
			}
		}
		return resultadoSaldo;
	}
	
	public List<Transacao> listarTransacoesNoMes(int mes, int ano ){
		List<Transacao> transacoesNoMes = new ArrayList<Transacao>();
		for(Transacao trans : this.transacoes) {
			if(trans.getData().getMonthValue() == mes && trans.getData().getYear() == ano) {
				transacoesNoMes.add(trans);
			}
		}
		return transacoesNoMes;
	}  
	
	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
}
