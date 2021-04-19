package 학습용;

import java.io.*;

/**
 * 문자열 편집 거리 알고리즘 응용(교과서:82p)
 * 
 * @author CSJ
 *
 */
public class Dynamicprogramming {

	/**
	 * 
	 * @param n   -> x배열의 크기
	 * @param m   -> y배열의 크기
	 * @param x   -> 문자배열(크기는 정수 n)
	 * @param y   -> 문자배열(크기는 정수 m)
	 * @param ins -> 삽입비용
	 * @param del -> 삭제 비용
	 * @param chg -> 변경 비용
	 * @return
	 */
	public static int ED(int n, int m, String[] x, String[] y, int ins, int del, int chg) {
		int[][] E = new int[n + 1][m + 1];
		E[0][0] = 0;// 초깃값

		for (int i = 1; i <= n; i++) { // 첫 열의 초기화
			E[i][0] = E[i - 1][0] + del;
		}

		for (int i = 1; i <= n; i++) { // 첫 행의 초기화
			E[0][i] = E[0][i - 1] + ins;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				int c = (x[i] == y[j]) ? 0 : chg;
				int max = Math.min(E[i - 1][j] + del, E[i][j - 1] + ins);
				int max2 = Math.min(E[i][j - 1] + ins, E[i - 1][j - 1] + c);

				E[i][j] = Math.min(max, max2);
			}
		}

		return E[n][m];
	};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("x배열의 크기: ");
		int n = Integer.parseInt(br.readLine());

		System.out.print("y배열의 크기: ");
		int m = Integer.parseInt(br.readLine());

		String[] x = new String[n];
		String[] y = new String[m];

		System.out.println("x의 배열값: ");
		for (int i = 0; i < x.length; i++) {
			x[i] = br.readLine();
		}

		System.out.println("y의 배열값: ");
		for (int i = 0; i < y.length; i++) {
			y[i] = br.readLine();
		}

		System.out.print("삽입비용: ");
		int ins = Integer.parseInt(br.readLine());

		System.out.print("삭제비용: ");
		int del = Integer.parseInt(br.readLine());

		System.out.print("변경비용: ");
		int chg = Integer.parseInt(br.readLine());

		System.out.println("결과: " + ED(n, m, x, y, ins, del, chg));
	}
}