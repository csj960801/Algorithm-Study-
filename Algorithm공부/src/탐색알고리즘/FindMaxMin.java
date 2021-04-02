package 탐색알고리즘;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxMin {

	/**
	 * 
	 * 최소값과 최댓값 구하기
	 * 
	 * @param A   => 데이터들
	 * @param n   => 데이터 갯수
	 * @param min => 최솟값
	 * @param max => 최댓값
	 * @return
	 */
	public static int[] Find(int A[], int n, int min, int max) {

		// 최솟값과 최댓값 초기화
		if (A[0] < A[1]) {
			min = A[0];
			max = A[1];
		} else {
			min = A[1];
			max = A[0];
		}

		int[] result = new int[2];// 최솟값과 최댓값을 담을 배열
		int small = min;// 작은 값
		int large = 0;// 큰 값 비교

		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		for (int i = 0; i < A.length; i++) {

			if (A[i] > max) {
				large = A[i];
			}
			result[0] = small;
			result[1] = large;

		}

		return result;
	};

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("실행 케이스:");
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

// 계속 for문 만 사용하는게 질려서 한번 작성해 봄
//		int i = 0;
//		while (true) {
//			i++;
//			System.out.println(i);
//			A[i] = Integer.parseInt(br.readLine());
//			// Arrays.sort(A);
//
//			if (i == (n + 1)) {
//				break;
//			}
//		} // end of while

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		for (int result : Find(A, n, 0, 0)) {
			System.out.println(result);
		}
	}

}
