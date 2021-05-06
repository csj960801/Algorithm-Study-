package _2021_05_06;

import java.io.*;

/**
 * fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
 * 
 * fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
 * 
 * fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
 * 
 * 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
 * 
 * fibonacci(0)은 0을 출력하고, 0을 리턴한다.
 * 
 * fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
 * 
 * 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
 * 
 * fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다. 1은 2번 출력되고, 0은 1번
 * 출력된다.
 * 
 * N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.
 * 
 * @author CSJ
 *
 */
public class Fibonacci {

	/**
	 * 
	 * @param n => 입력 받은 정수값
	 * @return
	 */
	public static String fibonacci(int n) {

		int[] numlist = new int[n + 1];

		String result = "";
		if (n == 0) {
			result = "0";
			return Integer.toString(0) + " " + Integer.toString(1);
		} else if (n == 1) {
			result = "1";
			return Integer.toString(1) + " " + Integer.toString(0);
		} else {
			numlist[0] = 0;
			numlist[1] = 1;
			for (int i = 2; i < numlist.length; i++) {
				// System.out.println("i:" + i);
				numlist[i] = numlist[i - 1] + numlist[i - 2];
				// System.out.println("numlist[i]: " + numlist[i]);
				result = Integer.toString(numlist[i - 1]) + " " + Integer.toString(numlist[i - 2]);
			}
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스

		int[] n = new int[T];
		for (int i = 0; i < T; i++) {
			n[i] = Integer.parseInt(br.readLine());

			System.out.println("결과: " + fibonacci(n[i]));
		}
	}

}
