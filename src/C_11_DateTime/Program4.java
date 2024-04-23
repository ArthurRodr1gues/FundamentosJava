package C_11_DateTime;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program4 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekDate = d04.minusDays(7);
		LocalDate nextWeekDate = d04.plusDays(7);
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("p1: pastWeekDate = " + pastWeekDate);
		//Resultado:
 
		System.out.println("p2: nextWeekDate = " + nextWeekDate);
		//Resultado:
		
		System.out.println("p3: pastWeekLocalDate = " + pastWeekLocalDate);
		//Resultado:

		System.out.println("p4: nextWeekLocalDate = " + nextWeekLocalDate);
		
	
		System.out.println("p5: pastWeekInstant = " + pastWeekInstant);
		System.out.println("p6: nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("p7: t1 dias = " + t1.toDays());
		System.out.println("p8: t2 dias = " + t2.toDays());
		System.out.println("p9: t3 dias = " + t3.toDays());
		System.out.println("p10: t4 dias = " + t4.toDays());
	}
}
/*************
 * Terminal *
 *************
p1: pastWeekDate = 2022-07-13
p2: nextWeekDate = 2022-07-27
p3: pastWeekLocalDate = 2022-07-13T01:30:26
p4: nextWeekLocalDate = 2022-07-27T01:30:26
p5: pastWeekInstant = 2022-07-13T01:30:26Z
p6: nextWeekInstant = 2022-07-27T01:30:26Z
p7: t1 dias = 7
p8: t2 dias = 7
p9: t3 dias = 7
p10: t4 dias = -7
 
*/