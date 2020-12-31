package questao2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class RepositorioPessoas {

	ArrayList<Pessoa> pessoas;
	Period periodo;
	
	RepositorioPessoas () {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public boolean cadastrarPessoas(Pessoa pessoa) {
		boolean pessoaJaExiste = true;
		for(Pessoa pessoaCadastrada : this.pessoas) {
			if(pessoaCadastrada.equals(pessoa)) {
				pessoaJaExiste = false;
				break;				
			}
		}
		if(pessoaJaExiste) {
			pessoas.add(pessoa);
		}
		return pessoaJaExiste;
	}
	
	public ArrayList<Pessoa> listarPessoasMaioresIdade() {
		ArrayList<Pessoa> listagemDosMaioresDe18Anos = new ArrayList<Pessoa>();
		for(Pessoa pessoa : pessoas) {
			periodo = Period.between(pessoa.getDataNascimento(), LocalDate.now());
			if(18 <= periodo.getYears()) {
				listagemDosMaioresDe18Anos.add(pessoa);
			}
		}
		return listagemDosMaioresDe18Anos;
	}
	public ArrayList<Cliente> listarCientesMaioresIdade() {
		ArrayList<Cliente> listagemDeClientesMaioresIdade = new ArrayList<Cliente>();
		for(Pessoa pessoa: pessoas) {
			Cliente pessoaCliente;
			if(pessoa instanceof Cliente) {
				periodo = Period.between(pessoa.getDataNascimento(), LocalDate.now());
				pessoaCliente = ((Cliente)pessoa);
				if(periodo.getYears() >= 18) {
					listagemDeClientesMaioresIdade.add(pessoaCliente);
				}
			}
		}
		return listagemDeClientesMaioresIdade;
	}
	public ArrayList<Funcionario> listarFuncionariosComSalarioMaiorQue(double threshold) {
		ArrayList<Funcionario> listagemDeFuncionariosComSalarioMaiorQueLimiar = new ArrayList<Funcionario>();
		
		for(Pessoa pessoa : pessoas ) {
			Funcionario pessoaFuncionario;
			if(pessoa instanceof Funcionario) {
				pessoaFuncionario = ((Funcionario)pessoa);
				if(pessoaFuncionario.getSalario() > threshold) {
					listagemDeFuncionariosComSalarioMaiorQueLimiar.add(pessoaFuncionario);
				}
			}
		}
		return listagemDeFuncionariosComSalarioMaiorQueLimiar;
	}
	public ArrayList<Gerente> listarGerentesDaArea(String area) {
		ArrayList<Gerente> listagemDeGerentesDeUmaArea = new ArrayList<Gerente>();
		
		for(Pessoa pessoa: pessoas) {
			Gerente pessoaGerente;
			if(pessoa instanceof Gerente) {
				pessoaGerente = (Gerente) pessoa;
				if(pessoaGerente.getArea().equals(area)) {
					listagemDeGerentesDeUmaArea.add(pessoaGerente);
				}
			}
		}
		return listagemDeGerentesDeUmaArea;
	}
}
