package 학습용;

import java.io.*;

public class Matrix {

	public static int MinMatMul(int n, int[] d) {
		int result = 0;
		int j = 0;
		int k = 0;

		int[][] C = new int[1][n];
		for (int i = 1; i <= n; i++) {
			C[i][i] = 0;
		}
		for (int s = 1; s <= n - 1; s++) {
			for (int i = 1; i <= n; i++) {
				j = i + s;
				C[i][j] = Math.min(C[1][n], (C[i][k] + C[k + 1][j] + d[i - 1] * d[k] * d[j]));
			}
		}
		return C[1][n];
	}// end of MinMatMul

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] d = new int[n];

		System.out.println(MinMatMul(n, d));
	}
}
