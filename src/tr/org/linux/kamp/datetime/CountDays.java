package tr.org.linux.kamp.datetime;


import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CountDays {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Doğduğunuz tarihinizi bday bmonth byear olarak giriniz :");
		int bday = input.nextInt();
		int bmonth = input.nextInt();
		int byear = input.nextInt();
		
		
		LocalDate birthDate = LocalDate.of(byear, bmonth, bday);
		LocalDate currentTime = LocalDate.now();
		
		ChronoUnit.DAYS.between(birthDate, currentTime);
		System.out.println(ChronoUnit.DAYS.between(birthDate, currentTime) +" gündür hayattasınız.");


		
	}

}
