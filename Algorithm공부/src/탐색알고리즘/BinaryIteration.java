package 탐색알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 이진탐색 응용 알고리즘(교과서: 39p)
 * 
 * @author CSJ
 *
 */
public class BinaryIteration {

	/**
	 * 
	 * @param A => 탐색 대상 배열
	 * @param n => 탐색 대상 원소 개수(배열의 크기)
	 * @param x => 찾을 값
	 * @return
	 * 
	 *         출력: 배열 A에서 x의 위치 반환 이진탐색은 (시작 인덱스 + 마지막 인덱스 / 2)를 사용해 중간값을 구함을 시작으로
	 *         왼쪽과 오른쪽 값을 조절하며 찾을 값 x를 찾음.
	 * 
	 *         이진탐색은 입력이 정렬된 리스트에 대해서만 적용 가능. 데이터의 삽입과 삭제 연산을 수행하면 데이터의 이동 발생 데이터
	 *         삽입/삭제 후에는 데이터를 정렬 상태로 유지하기 위해서는 n/2개의 데이터를 이동해야 함으로 삽입과 삭제가 빈번한 응용에서의
	 *         탐색으로는 적합하지않음.
	 */
	public static int Binary_Iteration(int A[], int n, int x) {
		int left = 0;
		int right = n;

		int mid = 0;
		//오른쪽에서 더 이상 서치할 데이터가 없을 때까지 반복.
		while (left <= right) {
			mid = (left + right) / 2; // 중간 값
			if (A[mid] == x) {
				return mid;
			}
			// 맨 오른쪽(데이터의 길이만큼)에서 부터 하나씩 거쳐오도록 증감.
			else if (x < A[mid]) {
				right = mid - 1;
			}
			// 맨 왼쪽(그래서 왼쪽은 값이 0임)에서 하나씩 거쳐오도록 증가
			else {
				left = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) throws Exception {

		// Scanner보다 실행속도가 빠르므로 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("실행 케이스:");
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("찾을 값:");
		int x = Integer.parseInt(br.readLine());

		// 배열은 0부터 카운팅됨으로 만약 [3]으로 적용되어 있으면 0,1,2,3, 즉 크기가 + 1이 됨으로 1를 빼주어야함.
		int result = Binary_Iteration(A, A.length - 1, x);
		System.out.println(x + "의 위치: " + result);
	}

}