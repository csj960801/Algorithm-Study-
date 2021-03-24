package 백준;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();

		if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
			year = 1;
		} else {
			year = 0;
		}
		System.out.println(year);
	}

}