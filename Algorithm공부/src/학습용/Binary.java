package 학습용;

import java.io.*;
import java.util.Arrays;

/**
 * 이진탐색 응용 구현
 * 
 * @author CSJ
 *
 */
public class Binary {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("실행케이스:");
		int c = Integer.parseInt(br.readLine());
		int[] arr = new int[c];
		for (int i = 0; i < c; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);// 순서대로 정렬
		System.out.println("정렬된 값: " + Arrays.toString(arr));

		System.out.print("서칭값:");
		int find = Integer.parseInt(br.readLine());

		// 필수값: 왼쪽값, 오른쪽값, 중간값
		int left = 0;
		int right = arr.length - 1;

		// 왼쪽부터 하나씩 서칭하도록 반복문을 짜주자
		while (left < right) {

			int mid = (left + right) / 2;
			if (arr[mid] == find) {
				System.out.println("위치: " + mid);
				return;
			}

			// 서칭값보다 나열된 값이 더 클 경우 오른쪽부터 1씩 줄여오도록
			else if (arr[mid] > find) {
				right = mid - 1;
				System.out.println("오른쪽: " + right);
			}

			// 서칭값이 나열된 값보다 더 클 경우 왼쪽부터 1씩 높여오도록
			else if (arr[mid] < find) {
				left = mid + 1;
				System.out.println("왼쪽: " + left);
			}
		}
		br.close();
	}

}
