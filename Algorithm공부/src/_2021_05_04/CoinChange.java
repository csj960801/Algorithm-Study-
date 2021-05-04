package _2021_05_04;

import java.io.*;

/**
 * 거스름돈 문제 복습 응용
 * 
 * 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고,
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을
 * 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 예를 들어 입력된 예1의 경우에는 아래 그림에서 처럼 4개를 출력해야 한다. 
 * 
 * @author CSJ
 *
 */
public class CoinChange {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 1000;// 지불한 값
		int pay = Integer.parseInt(br.readLine()); // 산 물건의 값
		// 산 물건의 값이 지불해야하는 값보다 클 경우 종료.
		if (n < pay) {
			return;
		}

		int change = n - pay;

		int[] coins = { 500, 100, 50, 10, 5, 1 };
		int[] coinCnt = new int[coins.length];
		for (int i = 0; i < coins.length; i++) {
			coinCnt[i] = change / coins[i];
			change = change - (coins[i] * coinCnt[i]); // 거스름돈 = 거스름돈 - (동전 * 동전개수)
			System.out.println(coinCnt[i]);
		}

		br.close();
	}
}