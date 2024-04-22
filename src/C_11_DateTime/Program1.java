package C_11_DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

public class Program1 {

	public static void main(String[] args) {

		
		
		LocalDate d01 = LocalDate.now();
        //d01 = 2024-04-22

		LocalDateTime d02 = LocalDateTime.now();
		//d02 = 2024-04-22T14:57:07.443569100
        
        Instant d03 = Instant.now();
		//d03 = 2024-04-22T17:57:07.443569100Z

		LocalDate d04 = LocalDate.parse("2022-07-20");
		//d04 = 2022-07-20

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		//d05 = 2022-07-20T01:30:26
        
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//d06 = 2022-07-20T01:30:26Z
        
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		//d07 = 2022-07-20T04:30:26Z
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		//d08 = 2022-07-20

        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        //d09 = 2022-07-20T01:30

		LocalDate d10 = LocalDate.of(2022, 07, 20);
		//d10 = 2022-07-20
        
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		//d11 = 2022-07-20T01:30

		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}
/*

 */