package 백준;

import java.io.*;

public class OrdinallyBackpack {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 물건의 개수
		System.out.print("물품의 수:");
		int n = Integer.parseInt(br.readLine());

		// 준서가 버틸 수 있는 무게
		System.out.print("준서가 버틸 수 있는 무게:");
		int k = Integer.parseInt(br.readLine());

		// 각 물건의 무게
		int[] w = new int[n + 1];

		// 각 물건의 가치
		int[] v = new int[n + 1];

		int[] dp = new int[k + 1];

		// 물건의 무게와 가치 설정
		for (int i = 1; i <= n; i++) {
			System.out.print("물건의 무게: ");
			w[i] = Integer.parseInt(br.readLine());

			System.out.print("물건의 가치: ");
			v[i] = Integer.parseInt(br.readLine());
		} // end of for1

		// 준서가 버틸 수 있는 물건의 무게 만큼의 가치 합구하기
		for (int i = 1; i <= n; i++) {
			for (int j = k; j - w[i] >= 0; j--) {
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
				System.out.println("과정:" + dp[j]);
			}
		}
		System.out.println(dp[k]);
		br.close();
	}
}