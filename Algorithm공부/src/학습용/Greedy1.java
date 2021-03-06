package 학습용;

import java.io.*;
import java.util.Arrays;

/**
 * 그리디 알고리즘 응용(백준 5585 거스름돈 알고리즘)
 * 
 * 타로는 자주 JOI잡화점에서 물건을 산다. JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고,
 * 언제나 거스름돈 개수가 가장 적게 잔돈을 준다. 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때, 받을
 * 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 예를 들어 입력된 예1의 경우에는 아래 그림에서 처럼 4개를 출력해야 한다. 예제 입력 1 380 예제 출력 1 4
 * 
 * @author CSJ
 *
 */
public class Greedy1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("원소:");
		int element = Integer.parseInt(br.readLine());

		if (element >= 101) {
			return;
		}

		int[] coin_kind = { 5, 4, 3, 2, 1 };// 원소 종류
		// Arrays.sort(coin_kind);

		int[] coin_cnt = new int[coin_kind.length];// 동전의 종류 길이

		int result = 0;
		for (int i = 0; i < coin_kind.length; i++) {
			coin_cnt[i] = element / coin_kind[i];
			element -= (coin_kind[i] * coin_cnt[i]);

			System.out.println(coin_kind[i] + " 사용개수: " + coin_cnt[i]);
			result = result + coin_cnt[i];
		}

		System.out.println("사용한 원소 개수: " + result);
		br.close();
	}

}