package test3;

public class NumberBetween {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int st = 258;
		int end = 394;
		for (int i = st; i < end; i++) {
			if (i % 10 != 5) {
				System.out.println(i);
			}
		}
	}

}
