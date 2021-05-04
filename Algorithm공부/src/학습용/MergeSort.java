package 학습용;

import java.io.*;

/**
 * 입력크기 n=8인 배열에 대해 합병 정렬을 이용하여 정렬 하기(교과서 43p)
 * 
 * @author CSJ
 *
 */
public class MergeSort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

		int left = 0;
		int right = A.length - 1;
		int mid = n / 2; // 중간값

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		for (int j = 0; j < right; j++) {
			if (left < right) {

			}
		}
	}
}