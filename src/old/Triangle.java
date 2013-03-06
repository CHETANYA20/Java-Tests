package old;

import java.util.Scanner;

public class Triangle {
	/* Triangle */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int n = 1; n <= arr[i]; n++) {
				print(arr[i] - n, n, n);
			}

		}
	}

	private static void print(int sp, int n, int rep) {
		final String spc = " ";
		for (int i = 0; i < sp; i++) {
			System.out.print(spc);
		}
		for (int i = 0; i < rep; i++) {
			System.out.print(n + spc);
		}
		System.out.println();
	}

}
