package 백준;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Exam;
		Exam = sc.nextInt();

		StringBuffer sb = new StringBuffer();
		if (Exam >= 90) {
			sb.append("A");
		} else if (Exam >= 80) {
			sb.append("B");
		} else if (Exam >= 70) {
			sb.append("C");
		} else if (Exam >= 60) {
			sb.append("D");
		} else {
			sb.append("F");
		}

		System.out.println(sb.toString());
	}
}