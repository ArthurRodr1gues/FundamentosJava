package C_11_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //Sem fuso, data e hora local
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Com fuso
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Objeto de formatação que usa o instante mas converte para o local do usuário
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; //Esse nome da tabela de documentação, considera horário local
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; //Também está na documentação e utiliza fuso
		
		System.out.println("(L23) d04 = " + d04.format(fmt1)); //
        //Referência: LocalDate d04 = LocalDate.parse("2022-07-20")
		//Formato: DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")
		//Resultado:(L23) d04 = 20/07/2022
		//Resumo: Pegou uma data inserida no formato ISO e transformou no formato brasileiro

		System.out.println("(L26) d04 = " + fmt1.format(d04)); //Outra forma de fazer a mesma coisa da linha 23
        //Referência:LocalDate d04 = LocalDate.parse("2022-07-20")
		//Formato:DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")
		//Resultado:(L26) d04 = 20/07/2022
		//Resumo:Faz a mesma coisa do anterior, é só uma outra notação
        
        // Abaixo passamos a formatação direto, para não precisar de 
		//" DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")"
		// da linha 17.
		System.out.println("(L30) d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //

		
		System.out.println("(L33) d05 = " + d05.format(fmt1));//
		//Referência:"LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26")"
		//Formato: DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy")
		//Resultado:(L33) d05 = 20/07/2022
		//Resumo:Pega uma data e hora recebida, no formato ISO e extrai a hora já no formato br, definido em fmt1.

		System.out.println("(L34) d05 = " + d05.format(fmt2));
		//Referência:"LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26")"
		//Formato:"DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")"
		//Resultado:(L34) d05 = 20/07/2022 01:30
		//Resumo:Acrescentou a fmt1 a HH:mm para conseguir pegar uma data e hora em ISO e devolver em Br.

		System.out.println("(L35) d05 = " + d05.format(fmt4)); //Formatando com o .ISO_DATE_TIME, da tabela de documentação
		//Referência:"LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26")"
		//Formato:"DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME"
		//Resultado:(L35) d05 = 2022-07-20T01:30:26
		//Resumo: Pega a data e hora de entrada e converte para o formato ISO (nada muda, nesse exemplo)

		System.out.println("(L37) d06 = " + fmt3.format(d06)); //Pega o d06, em zulu, e converte para local formatado
		//Referência: Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Com fuso
		//Formato: DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault())
		//Resultado:'(L37) d06 = 19/07/2022 22:30'
		//Resumo:Pegou a data e hora no formato ISO e no fuso zulu e converteu para o formato br, já em GMT -3. 
		
		System.out.println("(L38) d06 = " + fmt5.format(d06)); //
		//Referência: Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Com fuso
		//Formato:DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT
		//Resultado:(L38) d06 = 2022-07-20T01:30:26Z
		//Resumo:
		
		System.out.println("(L39) d06 = " + d06.toString());
		//Referência: Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Com fuso
		//Formato:
		//Resultado:(L39) d06 = 2022-07-20T01:30:26Z
		//Resumo:

	}
}

/*************************************************************************************************
Exemplo de como fazer quando é recebido uma data e hora no formato br e precisa converter para ISO
/*************************************************************************************************

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Data e hora recebidas no formato dd/MM/yyyy
        String dataHoraRecebida = "22/04/2024 10:30";
        
        // Formato da data e hora recebida
        DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // Converte a string para LocalDateTime usando o formato de entrada
        LocalDateTime dataHora = LocalDateTime.parse(dataHoraRecebida, formatoEntrada);
        
        // Formato ISO_DATE_TIME
        DateTimeFormatter formatoISO = DateTimeFormatter.ISO_DATE_TIME;
        
        // Converte a LocalDateTime para o formato ISO_DATE_TIME
        String dataHoraISO = dataHora.format(formatoISO);
        
        // Exibe o resultado
        System.out.println("Data e hora em formato ISO_DATE_TIME: " + dataHoraISO);
    }
}

 */