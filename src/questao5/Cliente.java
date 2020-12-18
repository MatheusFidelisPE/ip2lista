package questao5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Cliente {

	private String cpf;
	private String nome;
	LocalDate dataNascimento;
	DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	Cliente(String nome, String cpf, String dataNascimento){
		setCpf(cpf);
		setNome(nome);
		setDataNascimento(dataNascimento);
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {		
		this.dataNascimento = LocalDate.parse(dataNascimento, this.formatar);
	}

	long calcularIdade() {
		Period periodo = Period.between(dataNascimento, LocalDate.now());
		return periodo.getYears();
	}
}
