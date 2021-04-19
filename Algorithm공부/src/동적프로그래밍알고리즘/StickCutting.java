package 동적프로그래밍알고리즘;

import java.io.*;

/**
 * 하나의 긴 막대기가 있는데 막대기 조각마다 가격이 다름. 막대기를 적절하게 잘라 가장 가격이 높게 만들어야함.
 * 
 * 길이(i): 0 1 2 3 4 5 6 7 8 9 10
 * 
 * 가격(pi): 0 1 5 8 9 10 17 17 20 24 30
 * 
 * @author CSJ
 *
 */
public class StickCutting {

	/**
	 * 상향식 방법은 가장 작은 부분 문제부터 풀어 저장해놓고 참조해 나가는 방식임.
	 * 
	 * 배열의 인덱스는 0부터 시작하므로 1을 막대의 수 n에 더해 주고 루프를 시작하도록.
	 * 
	 * @param n   => 막대의 수
	 * @param pi  => 가격입력
	 * @param max => 최댓값 저장 배열
	 * @return
	 */
	public static int BottomUp(int n, int[] pi, int[] max) {
		int result = 0;
		int num = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				num = Math.max(num, pi[j] + max[i - j]);
				System.out.println("상향식: " + num);
			}
			result = num;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 막대의 수
		int n = Integer.parseInt(br.readLine());

		// 최대 가격을 저장할 배열
		int[] max = new int[n + 1];

		// 가격 입력
		int[] price = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			price[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("상향식: " + BottomUp(n, price, max));
		System.out.println("하향식: " + UpBottom(n, price, max));
	}

	/**
	 * 하향식 방법은 재계산을 방지하는 장점이 있음.
	 * 
	 * @param n
	 * @param price
	 * @param maxNum
	 * @return
	 */
	public static int UpBottom(int n, int[] price, int[] maxNum) {
		int max = 0;
		if (n == 0) {
			return n;
		}
		if (maxNum[n] != 0) {
			return maxNum[n];
		}

		for (int i = 1; i <= n; i++) {
			max = Math.max(max, price[i]);
			System.out.println("하향식: " + max);
		}

		maxNum[n] = max;
		return maxNum[n];
	}
}