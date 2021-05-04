package 동적프로그래밍알고리즘;

import java.io.*;

/**
 * 동적 프로그래밍 알고리즘 응용(교과서:75p)
 * 
 * @author CSJ
 *
 */
public class MinMatMult {

	/**
	 * 연쇄 행렬 곱셈 알고리즘
	 * 
	 * @param n => 행렬의 개수
	 * @param d => 정수를 담을 배열
	 * @return
	 */
	public static int solution(int n, int[] d) {

		int j = 0;
		int k = 0;
		int[][] c = new int[n + 1][n + 1]; // n개의 행렬을 곱하는 데 필요한 곱셈 횟수의 최솟값
		int[][] p = new int[n + 1][n + 1]; // 최적의 곱셈 순서를 구할 수 있는 배열

		for (int i = 1; i <= n; i++) {
			c[i][i] = 0;
			System.out.println("첫번째: " + c[i][i]);
		}

		for (int s = 1; s <= n - 1; s++) {
			for (int i = 1; i <= n - s; i++) {
				j = i + s;
				System.out.println("j = i + s: " + j);
				
				c[i][j] = Math.min(c[i][k], c[i][k] + c[k + 1][j] + d[i - 1] * d[k] * d[j]);
				p[i][j] = k;
			}
		}

		return c[1][n];
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행렬의 갯수:");
		int n = Integer.parseInt(br.readLine());

		int[] d = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			d[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("결과: " + solution(n, d));
	}

}