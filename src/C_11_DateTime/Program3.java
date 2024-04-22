package C_11_DateTime;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program3 {

	public static void main(String[] args) {

		//Objetivo: converter data-hora global para local
        //Forma de obter a lista dos nomes dos países para o fuso horário
        // for (String s : ZoneId.getAvailableZoneIds())
		// System.out.println(s);

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        //Construtor: LocalDate s1 = LocalDate.ofInstant(Instant instant, ZoneId zone);
        //Explicação: pega o objeto d06 do tipo Instant, no formato zulu, e converte para br

		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        //Construtor: LocalDate s1 = LocalDate.ofInstant(Instant instant, ZoneId zone);
        //Explicação: pega o conteúdo do objeto d06, do tipo Instant, no formato zulu, e converte para Portugal

		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        //Construtor:LocalDate s1 = LocalDate.ofInstant(Instant instant, ZoneId zone);
        //Explicação: pega o conteúdo do objeto d06, do tipo Instant, no formato zulu, e converte o formato do sistema.

		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        //LocalDate s1 = LocalDate.ofInstant(Instant instant, ZoneId zone);
        ////Explicação: pega o conteúdo do objeto d06, do tipo Instant, no formato zulu, e converte Portugal

		System.out.println("r1 = " + r1);
        //Referência1: Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Referência2:LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        //Resultado: r1 = 2022-07-19
        //Resumo: Pega a data global passada ao d06 converte para a data do sistema.

		System.out.println("r2 = " + r2);
        //Referência1: Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Referência2: LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        //Resultado: r2 = 2022-07-20
        //Resumo: Pega a data global passada ao d06 e converte para Portugal

		System.out.println("r3 = " + r3);
        //Referência1: Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Referência2:LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        //Resultado: r3 = 2022-07-19T22:30:26
        //Resumo: Pega a data-hora fornecida ao d06 e converte para local
        //Observação: veja que voltou um dia!

		System.out.println("r4 = " + r4);
        //Referência1: Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        //Referência2: LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"))
        //Resultado: r4 = 2022-07-20T02:30:26
        //Resumo: Pega a data-hora zulu fornecida e converte para Portugal

		System.out.println("d04 dia = " + d04.getDayOfMonth());
        //Referência: LocalDate d04 = LocalDate.parse("2022-07-20");
        //Resultado: d04 dia = 20
        
		System.out.println("d04 mês = " + d04.getMonthValue());
        //Referência:LocalDate d04 = LocalDate.parse("2022-07-20");
        //Resultado: d04 mês = 7

		System.out.println("d04 ano = " + d04.getYear());
        //Referência:LocalDate d04 = LocalDate.parse("2022-07-20");
        //Resultado: d04 ano = 2022

		System.out.println("d05 hora = " + d05.getHour());
        //Referência:LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //Resultado: d05 hora = 1

		System.out.println("d05 minutos = " + d05.getMinute());
        //Referência:LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //Resultado: d05 minutos = 30

        System.out.println("d05 segundos = " + d05.getSecond());
        //Referência:LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        //Resultado: d05 minutos = 26

        

	}
}
