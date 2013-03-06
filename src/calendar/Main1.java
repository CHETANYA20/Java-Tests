package calendar;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Calendar
 * 
 * @author Dis
 * 
 */
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value1 = sc.nextLine();
		String value2 = sc.nextLine();
		sc.close();
		calculate(value1);
		calculate(value2);
	}

	private static void calculate(String value) {
		final String[] input = value.split("-");
		Calendar cl = Calendar.getInstance();
		cl.set(Integer.parseInt(input[0]), Integer.parseInt(input[1]), 28);
		String[] weekdays = new DateFormatSymbols().getWeekdays();
		System.out
				.println(weekdays[cl.get(Calendar.DAY_OF_WEEK)].toUpperCase());
	}
}
