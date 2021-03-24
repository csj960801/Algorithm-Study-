package 백준;

import java.util.*;
public class AB {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B) {
			System.out.println(">");
		}
		if (A < B) {
			System.out.println("<");
		}
		if (A == B) {
			System.out.println("==");
		}

	}
}