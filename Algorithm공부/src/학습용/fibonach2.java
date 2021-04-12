package 학습용;

import java.io.*;

/**
 * 동적프로그래밍을 활용한 피보나치 수열 응용
 * 
 * 0 1 1 2 3 5 8. . .
 * 
 * @author CSJ
 *
 */
public class fibonach2 {

	/**
	 * 학습한 피보나치 응용
	 * 
	 * @param n
	 * @param arr
	 * @return
	 */
	public static int finbonach(int n, int[] arr) {
		int result = 0;
		if (n == 0 || n == 1) {
			return n;
		}

		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(arr[i]);

			result = arr[i];
		}
		return result;
	}

	/**
	 * 원리를 응용해 재구현한 피보나치
	 * 
	 * @param n
	 * @return
	 */
	public static int customFibonach(int n) {

		int result = 0;// 결과

		// 초깃값
		int a = 0;
		int b = 1;

		// 입력된 정수 n만큼 반복문을 돌며
		for (int i = 0; i < n; i++) {
			result = a + b; // a와 b를 더해주도록함.
			a = b; // a는 b의 값을 가지도록하고,
			b = result; // b = a+b를 계속 반복시킴.
		}

		return (result == 0 || result == 1) ? result : result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n + 1];

		System.out.println("finbonach: " + finbonach(n, arr));
		System.out.println("customFibonach: " + customFibonach(n));
	}

}