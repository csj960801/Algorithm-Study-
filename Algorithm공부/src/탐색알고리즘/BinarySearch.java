package 탐색알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 이진 탐색 알고리즘 응용(교과서: 21p)
 * 
 * @author CSJ
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param A     => 배열
	 * @param left  => 왼쪽 값
	 * @param right => 오른쪽 값
	 * @param x     => 찾을 값
	 * @return
	 * 
	 * 반복형태 보다 비효율적임.
	 */
	public static int Binary(int[] A, int left, int right, int x) {

		// 입력: 탐색 대상 배열, 오름차순으로 정렬되어 있다고 가정. left와 right는 A배열에서 x를 찾는 구간임
		// 출력: 배열 A에서 x의 위치를 반환. x가없는 경우 -1을 반환하도록.
		if (left > right) {
			return -1;
		}

		int mid = (left + right) / 2;
		if (x == mid) {
			return mid;
		} else if (A[mid] > x) {
			return Binary(A, left, mid - 1, x);
		} else {
			return Binary(A, mid + 1, left, x);
		}
	}// end of method()

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 실행 케이스
		int Case = Integer.parseInt(br.readLine());
		int[] arr = new int[Case];

		for (int i = 0; i < Case; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("찾을 값:");
		int x = Integer.parseInt(br.readLine());

		System.out.print("왼쪽 값(left):");
		int left = Integer.parseInt(br.readLine());

		System.out.print("오른쪽 값(right):");
		int right = Integer.parseInt(br.readLine());

		// 찾을 값 x가 배열안에 존재 할 경우
		int result = Binary(arr, left, right, x);
		if (x == arr[result]) {
			System.out.println(result + "번째에 '" + x + "' 가 존재합니다");
		}

	}

}