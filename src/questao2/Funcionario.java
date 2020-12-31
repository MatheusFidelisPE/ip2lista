package questao2;

public class Funcionario extends Pessoa {

	private double salario;
	private final double SALARIO_TETO_IMPOSTO;
	
	public Funcionario(String nome, String dataNascimento, double salario, double SALARIO_TETO_IMPOSTO) {
		super(nome, dataNascimento);
		this.salario = salario;
		this.SALARIO_TETO_IMPOSTO = SALARIO_TETO_IMPOSTO;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularImpostoDevido() {
		if( salario <= SALARIO_TETO_IMPOSTO) {
			return salario * 0.05;
		}
		else {
			return salario * 0.075;
		}
	}
	
	@Override
	public String toString() {
		String parte1 = super.toString();
		return parte1 + String.format(" Salário: R$ %.2f | Valor Imposto: R$ %.2f |", this.getSalario(), this.calcularImpostoDevido());
	}

	public double getSALARIO_TETO_IMPOSTO() {
		return SALARIO_TETO_IMPOSTO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(SALARIO_TETO_IMPOSTO);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Double.doubleToLongBits(SALARIO_TETO_IMPOSTO) != Double.doubleToLongBits(other.SALARIO_TETO_IMPOSTO))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
}
