package 백준;

import java.util.Scanner;

/**
 * n 사분면 구하기
 * @author CSJ
 *
 */
public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;

		if (x > 0 && y > 0) {

			result = 1;

		} else if (x < 0 && y > 0) {

			result = 2;

		} else if (x < 0 && y < 0) {

			result = 3;

		} else {
			result = 4;
		}
		System.out.println(result);
	}

}