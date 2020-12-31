package questao2;

public class Gerente extends Funcionario {
	

	private String area;
	
	public Gerente(String nome, String dataNascimento, double salario, double SALARIO_TETO_IMPOSTO, String area) {
		super(nome, dataNascimento, salario, SALARIO_TETO_IMPOSTO);
		this.area = area;
	}
	
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String toString() {
		String parte1 = super.toString();
		return parte1 + String.format(" Area de atução: %6s |", this.getArea());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
}
