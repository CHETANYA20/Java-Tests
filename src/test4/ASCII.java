package test4;

import java.util.Scanner;

public class ASCII {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		sc.close();
		
		String[] event = value.split(",");
		int ss = 0;
		for (int i = 0; i < event[0].length(); i++) {
			char c = event[0].charAt(i);
			ss += (int) c;
		}
		int sd = 0;
		for (int i = 0; i < event[0].length(); i++) {
			char c = event[1].charAt(i);
			sd += (int) c;
		}
		System.out.println(ss - sd);

	}
}
