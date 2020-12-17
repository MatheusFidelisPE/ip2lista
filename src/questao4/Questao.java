package questao4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Questao{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.print("Data no formato dd/MM/yyyy: ");
		String dataDigitada = scan.next();
		
		//Quest�o 4.a ->  pegando uma string e transformando em um objeto do tipo LocalDate.
		LocalDate data = LocalDate.parse(dataDigitada, formatador);
		
		//Quest�o 4.b -> Pegando data de hj e calculando a diferen�a para a data digitada em dias.
		LocalDate dataHoje = LocalDate.now();
		Period periodo = Period.between(data, dataHoje) ;
		System.out.println(Math.abs(periodo.getDays()));
		
		//Quest�o 4.c -> Somando 110 dias a data digitada pelo usuario.
		System.out.println(data.plusDays(110).format(formatador));
		
		//Quest�o 4.d -> ALterando o m�s da data informada pelo usuario.
		System.out.println(data.withMonth(8).format(formatador));
		
		//Quest�o 4.e -> Alterando a formata��o da data.
		DateTimeFormatter formatadorParaExtenso = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
		System.out.println(data.format(formatadorParaExtenso));
		
		//Quest�o 4.f ->  Calculando o n�mero de dias �teis em um periodo.
		System.out.print("Informe a data no formato dd/MM/yyy: ");
		String dataDigitada1 = scan.next();
		LocalDate data1 = LocalDate.parse(dataDigitada1, formatador);
		
		System.out.print("Informe a data no formato dd/MM/yyy: ");
		String dataDigitada2 = scan.next();
		LocalDate data2 = LocalDate.parse(dataDigitada2, formatador);
		
		System.out.println(Questao.calcularDiasuteis(data1, data2));
		
		
		System.out.println(data.format(formatador));
		
	}
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