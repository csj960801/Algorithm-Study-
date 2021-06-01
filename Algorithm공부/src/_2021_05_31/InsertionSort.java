package _2021_05_31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 삽입정렬 응용 알고리즘(교과서:165 ~ 167p)
 * 
 * 삽입 정렬은 주어진 데이터를 하나씩 뽑은 후, 나열된 데이터들이 항상 정렬된 형태를 가지도록 뽑은 데이터를 바른 위치에
 * 
 * 삽입함으로 나열하는 방식임.
 * 
 * @author CSJ
 *
 */
public class InsertionSort {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());// 배열원소 삽입
			int val = arr[i];// 미정렬 부분의 첫 번째 원소 선택
			// System.out.println("미정렬 부분의 첫 번째 원소 선택: " + val);

			for (int ii = i; ii > 0 && arr[ii - 1] > val; ii--) {// 정렬 부분에서 제자리 찾기

				// 정렬 부분의 값 arr[ii - 1]이 크면 뒤로 한 칸 이동
				if (arr[ii] < arr[ii - 1]) {
					int test = arr[ii];
					arr[ii] = arr[ii - 1];
					arr[ii - 1] = test;
				}
				// arr[ii] = val;// 제 위치에 선택된 원소를 삽입하도록함.
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}