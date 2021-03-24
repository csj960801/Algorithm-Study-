package 탐색알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 순차탐색 알고리즘 응용(교과서:21p)
 * 
 * @author CSJ
 *
 */
public class SequentialSearch {

	/**
	 * 순차 탐색 함수
	 * 
	 * @param A => 데이터들
	 * @param n => 실행 케이스
	 * @param x => 찾을 값
	 * @return
	 * @throws Exception
	 */
	public static int Sequential(int[] A, int n, int x, BufferedReader br) throws Exception {

		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(br.readLine());
			// 배열 안에 찾을 값 x가 존재할 경우 x를 리턴하고 종료
			if (x == A[i]) {
				return x;
			}
		}
		br.close();
		return -1;
	}// end of method()

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

		int result = Sequential(A, n, 9, br);
		if (result < 0) {
			return;
		}
		System.out.println(result);

		br.close();
	}
}