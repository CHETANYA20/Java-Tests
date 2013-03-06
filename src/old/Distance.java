package old;

import java.util.Scanner;

public class Distance {
	/*
	 * Write a program to calculate the distance travelled by a car at different
	 * time intervals. The initial velocity of the car is 36 km/hr and the
	 * constant acceleration is 5 m/s2.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t1 = scanner.nextInt();
		int t2 = scanner.nextInt();
		scanner.close();
		final int v = 10;
		final int a = 5;
		final int divider = 2;

		t1 = v * t1 + ((a * t1) / divider) * t1;
		t2 = v * t2 + ((a * t2) / divider) * t2;
		System.out.println(t1 + "\n" + t2);
	}
}
