package questao3;

import java.time.LocalDate;

public class MainTeste {

	public static void main(String[] args) {
		
		System.out.println("inicio");
		Transacao desp1 = new DespesaComAgua("10/01/2021 00:00", "Despesa com água", 100);
		Transacao desp2 = new DespesaComAgua("10/02/2021 00:00", "Despesa com água", 93);
		Transacao desp3 = new DespesaComAgua("10/03/2021 00:00", "Despesa com água", 70);
		Transacao desp4 = new DespesaComEnergia("10/04/2021 00:00", "Despesa com Energia", 250);
		Transacao desp5 = new DespesaComEnergia("10/05/2021 00:00", "Despesa com Energia", 300);
		Transacao desp6 = new DespesaComEnergia("10/06/2021 00:00", "Despesa com Energia", 150);
		Transacao desp7 = new DespesaComInternet("10/07/2021 00:00", "Despesa com Internet", 200);
		Transacao desp8 = new DespesaComInternet("10/08/2021 00:00", "Despesa com Internet", 500);
		Transacao desp9 = new DespesaComInternet("10/09/2021 00:00", "Despesa com Internet", 250);
		
		Transacao rece1 = new LicencaBasica("10/01/2021 00:00", "Licenca Básica", 25);
		Transacao rece2 = new LicencaBasica("10/02/2021 00:00", "Licenca Básica", 10);
		Transacao rece3 = new LicencaBasica("10/03/2021 00:00", "Licenca Básica", 23);
		Transacao rece4 = new LicencaPlus("10/04/2021 00:00", "Licenca Plus", 20);
		Transacao rece5 = new LicencaPlus("10/05/2021 00:00", "Licenca Plus", 23);
		Transacao rece6 = new LicencaPlus("10/06/2021 00:00", "Licenca Plus", 100);
		Transacao rece7 = new LicencaEnterprise("10/07/2021 00:00", "Licenca EnterPrise", 8);
		Transacao rece8 = new LicencaEnterprise("10/08/2021 00:00", "Licenca EnterPrise", 10);
		Transacao rece9 = new LicencaEnterprise("10/09/2021 00:00", "Licenca EnterPrise", 15);
		
		FluxoCaixa empr1 = new FluxoCaixa("EmpresaQualquer", "11150.22221.9922");
		
		// Cadastrando receitas
		empr1.adicionarTransacao(rece9);
		empr1.adicionarTransacao(rece8);
		empr1.adicionarTransacao(rece7);
		empr1.adicionarTransacao(rece6);
		empr1.adicionarTransacao(rece5);
		empr1.adicionarTransacao(rece4);
		empr1.adicionarTransacao(rece3);
		empr1.adicionarTransacao(rece2);
		empr1.adicionarTransacao(rece1);
		
		//Cadastrando despesas
		empr1.adicionarTransacao(desp9);
		empr1.adicionarTransacao(desp8);
		empr1.adicionarTransacao(desp7);
		empr1.adicionarTransacao(desp6);
		empr1.adicionarTransacao(desp5);
		empr1.adicionarTransacao(desp4);
		empr1.adicionarTransacao(desp3);
		empr1.adicionarTransacao(desp2);
		empr1.adicionarTransacao(desp1);

		// testes
		
		//System.out.println(desp7.calcularTotal());
		
	
		
		
		System.out.println("Empresa: " + empr1.getNomeEmpresa() + " | CNPJ: " + empr1.getCnpj());
		//Calcular Despesas em um intervalo.
		System.out.printf("Valor das Despesas no intervalo (05/01/2021 -> 06/05/2021): R$ %.2f\n",
				empr1.calcularDespesas(LocalDate.parse("2021-01-05"), LocalDate.parse("2021-05-06")));
		
		// Calcular Receitas em um certo intervalo
		System.out.printf("Valor das receitas no intervalo(12/05/2021 -> 20/10/2021): R$ %.2f\n", 
		empr1.calcularReceitas(LocalDate.parse("2021-08-12"), LocalDate.parse("2021-10-12")));
		
		// Percentual de Receitas em relação ao ano
		System.out.printf("Porcentagem das receitas no mês 6 do ano 2021: %.2f%%\n", empr1.percentualReceitasNoMes(6, 2021));
		
		// Percentual de Despesas em relação ao ano 
		System.out.printf("Porcentagem das despesas no mês 5 do ano 2021: %.2f%%\n", empr1.percentualDespesasNoMes(6, 2021));
		
		// Saldo Atual em caixa
		System.out.printf("Saldo atual: R$%.2f\n", empr1.saldoAtual());
		
		//Método lista transações no mês.
		for(Transacao trans :empr1.listarTransacoesNoMes(6, 2021) )
		System.out.print(trans);
	}
}
