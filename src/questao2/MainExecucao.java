package questao2;

public class MainExecucao {
	public static void main(String[] args) {
		
		RepositorioPessoas rP = new RepositorioPessoas();
		
		//Instanciando clientes
		Cliente cl1 = new Cliente("Matheus", "05/04/2000", 1234);
		Cliente cl2 = new Cliente("Ana", "21/07/2015", 1235);
		Cliente cl3 = new Cliente("Julio", "16/03/1999", 1236);
		Cliente cl4 = new Cliente("Carla", "15/06/2008", 1237);
		Cliente cl5 = new Cliente("Eva", "10/11/2009", 1238);
		
		//Instância Parecida com cl2, mas que tem o código diferente. Nome e data de Nascimento iguais, mas código diferentes.
		Cliente cl6 = new Cliente("Ana", "21/07/2015", 123);
		//Instância de cliente igual a instância cl6
		Cliente cl7 = new Cliente("Ana", "21/07/2015", 123);
		
		rP.cadastrarPessoas(cl1);
		rP.cadastrarPessoas(cl2);
		rP.cadastrarPessoas(cl3);
		rP.cadastrarPessoas(cl4);
		
		//Testando cadastramento de objetos repetidos.
		System.out.println("\n\nTestando método cadastrar pessoas com instâncias do tipo Cliente.");
		System.out.println("Cadastrando cl5: " + rP.cadastrarPessoas(cl5));
		System.out.println("Cadastrando cl6: " + rP.cadastrarPessoas(cl6));
		System.out.println("Cadastrando cl7: " + rP.cadastrarPessoas(cl7));
		
		//Instanciando Fncionarios
		Funcionario func1 = new Funcionario("José", "10/11/2003", 700.56, 1550.00);
		Funcionario func2 = new Funcionario("Marcos", "15/01/1998", 2200.26, 2300.00);
		Funcionario func3 = new Funcionario("Maria", "16/04/1995", 2200.26, 2300.00);
		Funcionario func4 = new Funcionario("Patricia", "19/08/1993", 2200.26, 2300.00);
		Funcionario func5 = new Funcionario("João", "10/02/2005", 1550.56, 1550.00);
		
		//Instância parecida com func3. Nome e salário iguais, mas teto e data de nascimento diferentes.
		Funcionario func6 = new Funcionario("Maria", "10/02/2002", 2200.26, 1550.00);
		//Instância igual a func6.
		Funcionario func7 = new Funcionario("Maria", "10/02/2002", 2200.26, 1550.00);
		
		rP.cadastrarPessoas(func1);
		rP.cadastrarPessoas(func2);
		rP.cadastrarPessoas(func3);
		rP.cadastrarPessoas(func4);
		
		//Testando cadastramento de objetos repetidos.
		System.out.println("\n\nTestando método cadastrar pessoas com instâncias do tipo Funcionario.");
		System.out.println("Cadastrando func5: " + rP.cadastrarPessoas(func5));
		System.out.println("Cadastrando func6: " + rP.cadastrarPessoas(func6));
		System.out.println("Cadastrando func7: " + rP.cadastrarPessoas(func7));

		//Instanciando Gerentes
		Gerente ger1 = new Gerente("Gabriel", "12/12/1998", 3100.25, 3300.56, "Carga");
		Gerente ger2 = new Gerente("JOsé", "12/12/1998", 4150, 4500, "Vendas");
		Gerente ger3 = new Gerente("Mirela", "12/12/1998", 4200, 4500, "Vendas");
		Gerente ger4 = new Gerente("Joana", "12/12/1998", 6000.50, 6500.25, "RH");
		Gerente ger5 = new Gerente("Guilherme", "12/12/1998", 3500.25, 3300.56, "Carga");
		
		//Instância parecida com ger4. Nome, setor e teto iguais, mas idade e salário diferentes.
		Gerente ger6 = new Gerente("Joana", "12/12/1995", 6500.70, 6500.25, "RH");
		//Instância igual a ger6.
		Gerente ger7 = new Gerente("Joana", "12/12/1995", 6500.70, 6500.25, "RH");
		
		
		rP.cadastrarPessoas(ger1);
		rP.cadastrarPessoas(ger2);
		rP.cadastrarPessoas(ger3);
		rP.cadastrarPessoas(ger4);

		//Testando cadastramento de objetos repetidos.
		System.out.println("\n\nTestando método cadastrar pessoas com instâncias do tipo Gerente.");
		System.out.println("Cadastrando ger5: " + rP.cadastrarPessoas(ger5));
		System.out.println("Cadastrando ger6: " + rP.cadastrarPessoas(ger6));
		System.out.println("Cadastrando ger7: " + rP.cadastrarPessoas(ger7));

		System.out.printf("\n\n%-40s Listagem Maiores de idade:\n", " ");
		for(Pessoa pessoa : rP.listarPessoasMaioresIdade()) {
			System.out.println(pessoa);
		}
		System.out.printf("\n\n%-20s Listagem Clientes Maiores de idade:\n", " ");
		for(Pessoa pessoa : rP.listarCientesMaioresIdade()) {
			System.out.println(pessoa);
		}
		System.out.printf("\n\n%-40s Listagem Funcionários com Salário Maior Que 1600:\n", " ");
		for(Pessoa pessoa : rP.listarFuncionariosComSalarioMaiorQue(1600)) {
			System.out.println(pessoa);
		}
		System.out.printf("\n\n%-40s Listagem De Gerentes da Área Carga:\n", " ");
		for(Pessoa pessoa : rP.listarGerentesDaArea("Carga")) {
			System.out.println(pessoa);
		}
		
	}

}
