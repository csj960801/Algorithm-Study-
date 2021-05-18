package _2021_05_18;

import java.io.*;
import java.util.Arrays;

/**
 * 버블 정렬 알고리즘 응용(교과서:156p)
 * 
 * 버블 정렬은 왼쪽 값이 더 클 경우 자리를 바꿔가는 과정을 반복함으로 정렬해나가는 방식이다.
 * 
 * 두값의 비교를 위해서는 왼쪽에서 오른쪽으로 진행하거나 혹은 오른쪽에서부터 왼쪽으로 진행해나가기도함.
 * 
 * @author CSJ
 *
 */
public class BubbleSort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 데이터의 개수

		int[] A = new int[n];// 입력배열
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		int temp = 0;
		for (int i = 1; i <= A.length - 1; i++) { // n-1번의 건너뜀
			for (int ii = 1; ii <= (A.length - 1) - i; ii++) {// 왼쪽에서 오른쪽으로 진행하는 경우
				// System.out.println("ii: " + ii);
				if (A[ii] > A[ii + 1]) {// 왼쪽값 > 오른쪽값일 경우
					temp = A[ii];
					A[ii] = A[ii + 1];
					A[ii + 1] = temp;
				}
				if (A[0] > A[n - 1]) {
					Arrays.sort(A);
				}
			}
		}

		System.out.println(Arrays.toString(A));
	}
}