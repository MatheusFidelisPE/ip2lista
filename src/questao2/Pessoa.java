package questao2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Pessoa(String nome, String dataNascimento) {
		this.nome = nome;
		this.setDataNascimento(dataNascimento);
	}
	

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento.toString(), formatador);
	}


	public DateTimeFormatter getFormatador() {
		return formatador;
	}
	@Override
	public String toString() {
		return String.format("| Nome: %-16s | Data de Nascimento: %s |", this.getNome(), this.getFormatador().format(this.getDataNascimento()));
	}
}
