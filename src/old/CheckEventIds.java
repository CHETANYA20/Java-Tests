package old;

import java.util.Scanner;

public class CheckEventIds {
	/*
	 * Ross is an event organizer. He has received data regarding the
	 * participation of employees in two different events. Some employees have
	 * participated in only one event and others have participated in both
	 * events. Ross now needs to count the number of employees who have taken
	 * part in both events. The records received by Ross consist of employee
	 * ids, which are unique. Write a program that accepts the employee ids
	 * participating in each event (the first line relates to the first event
	 * and the second line relates to the second event). The program should
	 * print the number of common employee ids in both the events.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr1[];
		int arr2[];
		int res = 0;

		String tmp[] = scanner.nextLine().split(",");
		arr1 = new int[tmp.length];
		for (int i = 0; i < tmp.length; i++)
			arr1[i] = Integer.parseInt(tmp[i]);

		tmp = scanner.nextLine().split(",");
		scanner.close();
		arr2 = new int[tmp.length];
		for (int i = 0; i < tmp.length; i++)
			arr2[i] = Integer.parseInt(tmp[i]);
		
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					res++;
				}
			}
		}
		System.out.println(res);

	}
}
