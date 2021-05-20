package _2021_05_20;

import java.io.*;
import java.util.Arrays;

/**
 * 버블정렬 복습
 * 
 * @author CSJ
 *
 */
public class improved_BubbleSort {

	/**
	 * 
	 * @param n => 배열에 들어갈 데이터의 수
	 * @param a => 정렬 배열
	 * @return
	 */
	public static String bubbleSort(int n, int[] a) throws Exception {

		int result = 0;
		boolean check = false;

		// 1)배열에 들어간 데이터의 길이만큼 loop
		for (int i = 1; i <= a.length - 1; i++) {
			// 2)배열에 들어가있는 데이터들을 왼쪽부터 하나하나 비교해나가기
			for (int j = 1; j <= (a.length - 1) - i; j++) {
				// 3)왼쪽에 있는 값이 오른쪽에 있는 값보다 큰지를 비교함.
				if (a[j] > a[j + 1]) {

					check = true;
					if (!check) {
						System.out.println("더 이상 자리 바꿈이 일어나지 않으므로 종료합니다.");
						break;
					}

					result = a[j];
					a[j] = a[j + 1];
					a[j + 1] = result;
					
				} else {
					check = false;
				}

			}
		}
		return Arrays.toString(a);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		for (int i = 1; i <= a.length - 1; i++) {
			System.out.println(i + "번째에 들어갈 데이터를 입력해주세요.");
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("정렬결과: " + bubbleSort(n, a));
	}
}