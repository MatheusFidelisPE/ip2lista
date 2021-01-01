package questao3;

import java.time.LocalDate;
import java.util.List;

public class FluxoCaixa {
	private String nomeEmpresa;
	private String cnpj;
	
	public void adicionarTransacao(Transacao transacao) {
		
	}
	
	public double calcularDespesas(LocalDate inicio, LocalDate fim) {
		return 0.0;
	}
	
	public double calcularReceitas(LocalDate inicio, LocalDate fim) {
		return 0.0;
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
}
