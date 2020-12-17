package questao4;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Questao {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Informe a data no formato [dd/MM/yyyy]: ");
		String dataDigitada = scan.next();
		
		// Convertendo texto lido em data.
		LocalDate data = LocalDate.parse(dataDigitada, formatar);
		// Pegando a data atual.
		LocalDate hoje = LocalDate.now();
		
		long diferencaEmDias = ChronoUnit.DAYS.between(hoje, data);
		diferencaEmDias = Math.abs(diferencaEmDias);
		
		
		System.out.printf("Difirença em dias: %d\n", diferencaEmDias);
		
		System.out.println("A data somada a 110 dias resulta: " + data.plusDays(110));
		 
		LocalDate dataAlterandoMes;
		dataAlterandoMes = data.withMonth(8);
		String formatada = dataAlterandoMes.format(formatar);
		
		System.out.println("Data com mês em agosto: " + formatada);
		System.out.println("Data com mês em agosto: " + data);

		
		System.out.print("Informe a data 1 no formato [dd/MM/yyyy]: ");
		String dataDigitada1 = scan.next();
		
		System.out.print("Informe a data 2 no formato [dd/MM/yyyy]: ");
		String dataDigitada2 = scan.next();
		
		LocalDate data1 = LocalDate.parse(dataDigitada1, formatar);
		LocalDate data2 = LocalDate.parse(dataDigitada2, formatar);
		
		int diasContaveis =  Questao.calcularDiasuteis(data1,data2);
		System.out.println("Qte de dias Uteis: " + diasContaveis);
		
		scan.close();
		LocalDate novaData = LocalDate.parse("10/10/2010");
		System.out.println(novaData);
	}
	//Recebe duas datas e retorna um inteiro referente a quantidade de dias úteis.
	public static int calcularDiasuteis(LocalDate data1, LocalDate data2) {
		
		long diferencaEmDias = ChronoUnit.DAYS.between(data1, data2);
		int contagemDias = (int) diferencaEmDias;
		
		for(int contador = 0; contador <= diferencaEmDias; contador++) {
			if(data1.compareTo(data2) < 0) {
				if((data1.plusDays(contador).getDayOfWeek() == DayOfWeek.SATURDAY || data1.plusDays(contador).getDayOfWeek() == DayOfWeek.SUNDAY)) {
					contagemDias--;
				}
			}else {
				if((data2.plusDays(contador).getDayOfWeek() == DayOfWeek.SATURDAY || data2.plusDays(contador).getDayOfWeek() == DayOfWeek.SUNDAY)) {
					contagemDias--;
				}
			}
		}		
		return contagemDias;
	}
}
	
	