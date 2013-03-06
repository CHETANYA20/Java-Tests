package caps1st;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This Program Coding Initial Caps Will Test You
 */
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		String input3 = sc.nextLine();
		sc.close();
		printWord(input1);
		printWord(input2);
		printWord(input3);
	}

	public static void printWord(String value) {
		String arr[] = value.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String b = arr[i];
			Pattern p = Pattern.compile("^[A-Z]");
			Matcher m = p.matcher(b);
			if (m.find()) {
				System.out.println(b);
			}
		}
	}

}
