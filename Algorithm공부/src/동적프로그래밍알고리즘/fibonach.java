package 동적프로그래밍알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 동적 프로그래밍 응용 알고리즘 (교과서:70p) 
 * 동적프로그래밍 방법(Dynamic Programming)은 문제의 크기가 작은 소문제에
 * 대한 해를 저장 후 이를 이용하여 크기가 보다 큰 문제의 해를 점진적으로 만들어 가는 상향식 접근 방법임.
 * 
 * 동적 프로그래밍 방법은 주로 최솟값 혹은 최댓값을 구하는 최적화 문제에 사용됨.
 * 
 * @author CSJ
 *
 */
public class fibonach {

	/**
	 * 동적 프로그래밍 방식
	 * 
	 * @param n => 피보나치 수열의 순번
	 * @return
	 */
	public static int[] fibo(int n) {

		//지속해서 값을 더해나가는 과정에서 중간에 용량이 다 차버리므로 n + 1을 해주어야함.
		int[] arr = new int[n + 1];

		// 초깃값 0과 1 설정
		arr[0] = 0;
		arr[1] = 1;

		// i를 2부터 증가 시작함
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]);
			// System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int result : fibo(n)) {
			System.out.println(result);
		}
	}
}