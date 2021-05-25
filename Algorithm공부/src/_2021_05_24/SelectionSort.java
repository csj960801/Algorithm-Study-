package _2021_05_24;

import java.io.*;
import java.util.Arrays;

/**
 * 선택 정렬 알고리즘 응용(교과서: 160p ~ 161p)
 * 
 * 선택 정렬 알고리즘은 주어진 데이터들 가운데 가장 작은 값부터 차례대로 선택해서 나열하는 방식.
 * 
 * @author CSJ
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int[] A = new int[n];

			for (int i = 0; i < n; i++) {
				A[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < A.length - 1; i++) {
				int min = i;// 최솟값 적용

				for (int j = i + 1; j < A.length; j++) {
					
					if (A[j] < A[min]) {
						min = j;
					}

					// A[i]와 A[min]의 자리바꿈
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;

				}
			}

			System.out.println(Arrays.toString(A));

		} catch (

		Exception e) {
			System.out.println("예외발생: " + e.toString());
		}
	}
}