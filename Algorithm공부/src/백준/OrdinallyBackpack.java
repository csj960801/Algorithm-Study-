package 백준;

import java.io.*;
import java.util.Arrays;

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
		int[] w = new int[n];

		// 각 물건의 가치
		int[] v = new int[n];

		int[] dp = new int[k + 1];

		// 물건의 무게와 가치 설정
		for (int i = 0; i < n; i++) {
			System.out.print("물건의 무게: ");
			w[i] = Integer.parseInt(br.readLine());

			System.out.print("물건의 가치: ");
			v[i] = Integer.parseInt(br.readLine());
		} // end of for1

		// 준서가 버틸 수 있는 물건의 무게 만큼의 가치 합구하기
		// 반복문이 i 만큼 돌면서 무게(j)를 1씩 감소하는 동시에 j(버틸 수 있는 무게) - w[i](물품 무게) 계산
		for (int i = 0; i < n; i++) {
			for (int j = k; j - w[i] >= 0; j--) {
				System.out.println("i:" + i + ", j:" + j);
				System.out.println(Arrays.toString(dp));
				dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);// dp배열안 최댓값 출력
			}
		}
		System.out.println(dp[k]);
		br.close();
	}
}