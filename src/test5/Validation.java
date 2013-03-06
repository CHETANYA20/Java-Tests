package test5;


import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		String[] Array = new String[4];
		Scanner in = new Scanner(System.in);
		String pattern = "((?=.*[0-9])(?=.*[A-Z])(?=.*[@#*=])(?=[\\S]+$).{5,10})";

		for (int i = 0; i < Array.length; i++) {
			Array[i] = in.nextLine();
		}
		in.close();

		for (int i = 0; i < Array.length; i++) {
			if (Array[i].matches(pattern)) {
				System.out.println("PASS");
			} else {
				System.out.println("FAIL");
			}
		}
		

	}
}
