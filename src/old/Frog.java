package old;

import java.util.Scanner;

public class Frog {
	/*
	 * Kermit, a frog hops in a particular way such that: 1. He hops 20cm in the
	 * first hop, 10cm in the second hop and 5cm in the third hop. 2. After
	 * three hops Kermit rests for a while and then again follows the same
	 * hopping pattern.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		for (int i = 0; i < arr.length; i++) {
			int dist = 0;
			int inc = 20;
			while (arr[i]>0) {
				dist += inc;
				inc /= 2;
				if (inc < 5)
					inc = 20;
				arr[i]--;
			}
			System.out.println(dist);
		}

	}

}