package 백준;

import java.util.Scanner;

/**
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0
 * < A, B < 10)
 * 
 * 출력: 예제 입력 예제 출력 1 5 1 1 2 2 3 5 3 4 7 9 8 17 5 2 7
 * 
 * 
 * @author CSJ
 *
 */
public class AB3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// T는 for문으로 출력할 데이터의 수
		int T = sc.nextInt();
		int a, b;
		int[] array = new int[T];

		for (int i = 0; i < T; i++) {
			System.out.println(T);
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a + b);
			array[i] = a + b;
		}

		for (int result : array) {
			System.out.println(result);
		}
	}

}