package questao5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Cliente {

	String cpf;
	String nome;
	LocalDate dataNascimento;
	DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
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
		long diferencaAnos = ChronoUnit.YEARS.between(LocalDate.now(), dataNascimento);
		return diferencaAnos;
	}
}
