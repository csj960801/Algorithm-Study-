package _2021_05_13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 동적프로그래밍 계획법 점화식 구현법
 * 
 * @author CSJ
 *
 */
public class DynamicProgramming종류 {

	public static int memoization(int n, int[] array) {

		if (array[n] != -1) {
			return array[n];
		}
		if (n == 0) {
			return array[n] = 0;
		}
		if (n == 1) {
			return array[n] = 1;
		}
		return array[n] = memoization(n - 1, array) + memoization(n - 2, array);
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 1.다른 문제에서 가져오는 방식
		// 현재의 노드 값을 구하기 위해서 먼저 계산한 작은 문제에서 값을 가져와 해결하는 방식임.
		int[] array = new int[n + 1];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i <= n; i++) {
			array[i] = array[i - 1] + array[i - 2];          
			System.out.println("1번: " + array[i]);
		}

		System.out.println("");

		// 2.현재 문제에서 보내주는 방식
		// 1번과 반대의 개념임. 당장 해결해야하는 작은 문제를 먼저 해결 후, 앞으로 해결해야할 문제들에 보내주는 방식임.
		/*
		 * int[] array2 = new int[n]; array2[0] = 0; array2[1] = 1; for (int i = 0; i <
		 * n - 1; i++) { array2[i + 1] += array2[i]; array2[i + 2] += array2[i];
		 * System.out.println("2번: " + array2[i]); }
		 */

		// 3.메모이제이션
		// 한번 계산한 값을 메모리상에 저장해 두고 반복해서 수행해야 할 때에 사용하는 방식.
		System.out.println(memoization(n, array));
	}
}