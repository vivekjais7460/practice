package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date= LocalDate.now();
		LocalDate yesterday= date.minusDays(1);
		LocalDate tomorrow= date.plusDays(1);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
	System.out.println(date);
	System.out.println(yesterday);
	System.out.println(tomorrow);
		

	}

}
