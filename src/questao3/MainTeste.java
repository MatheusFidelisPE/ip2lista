package questao3;

import java.time.LocalDateTime;

public class MainTeste {

	public static void main(String[] args) {
		DespesaComAgua desp = new DespesaComAgua("", "", 15);
		LocalDateTime ini = LocalDateTime.of(2012, 6,30, 12, 00);

		System.out.println(ini.getClass());
	}
}
