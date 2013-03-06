package test6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class ShowData implements Comparable {
	String name;
	int marks;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public int compareTo(Object Student) throws ClassCastException {
		if (!(Student instanceof ShowData))
			throw new ClassCastException("Error");
		int mm = ((ShowData) Student).getMarks();
		return this.marks - mm;
	}
}

public class StudentsMarks {

	private static ShowData[] smartClean(ShowData[] data) {
		int num = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i].getName().equals(""))
				continue;
			for (int j = 0; j < data.length; j++) {
				if (data[j].getName().equals(""))
					continue;
				if (data[i].getName().equals(data[j].getName())
						&& data[i].getMarks() > data[j].getMarks()) {
					data[j].setName("");
					num++;
				}

			}
		}

		ShowData newData[] = new ShowData[data.length - num];
		int i = 0;
		for (int j = 0; j < data.length; j++) {
			if (data[j].getName().equals("")) {
				continue;
			}
			newData[i] = new ShowData();
			newData[i].setName(data[j].getName());
			newData[i].setMarks(data[j].getMarks());
			i++;
		}

		return newData;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 10;
		int j = 0;
		ShowData data[] = new ShowData[num];
		for (int i = 0; i < data.length; i++) {
			String tmp[] = input.nextLine().split("-");
			String name = tmp[0];
			int marks = Integer.parseInt(tmp[1]);

			data[i] = new ShowData();
			data[i].setName(name);
			data[i].setMarks(marks);
		}
		ShowData finalData[] = smartClean(data);
		Arrays.sort(finalData, Collections.reverseOrder());
		for (int i = 0; i < finalData.length; i++) {
			ShowData show = finalData[i];
			String name = show.getName();
			int marks = show.getMarks();
			System.out.println(name + "-" + marks);
		}
	}

}
