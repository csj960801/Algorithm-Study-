package 그리디알고리즘;

import java.io.*;

/**
 * 그리디 알고리즘 응용(교과서:110p)
 * 
 * 그리디 알고리즘은 욕심쟁이 방법으로 값을 구하는 일련의 선택마다 가장 최고라고
 * 여겨지는 최적값을 선택함으로 전체적인 최적값을 구하는 법임.
 * 그리디 알고리즘은 동적 프로그래밍과 마찬가지로 최적화 문제를 해결하는데 주로 사용됨.
 * 최적화 문제는 가능한 여러 해 중에서 최솟값 혹은 최댓값과 같이 가장 좋은 값을 찾는 문제임.
 * 
 * @author CSJ
 *
 */
public class CoinChange {

	/**
	 * 사용가능한 동전은 500원, 100원,50원,10원 이렇게 4종류가 있다. 
	 * 욕심쟁이 방법을 사용해 동전 거스름돈 문제를 해결하는 가장
	 * 간단하고 효율적인 방법은 거스름돈의 액수를 초과하지 않는다는 조건하에
	 * 큰 동전부터 욕심을 부려 최대한 사용함으로 거스름돈을 만드는 것임
	 * 
	 * @param T => 주어야하는 거스름 돈
	 * @param n => 동전의 종류
	 * @param C => 동전의 액면가를 감소순으로 저장하고 있는 배열
	 * @param X => 거스름돈으로 돌려줄 i번째 동전의 개수
	 * @return
	 */
	public static int coin_change(int T, int n, int[] coin, int[] coin_value) {

		// 동전의 종류에서 큰 동전부터 작은 동전의 수만큼 반복문 실행
		for (int i = 0; i < n; i++) {
			
			 // 동전의 종류(C[i])마다 거슬러주어야하는 값(T)을 나눈 후 각 사용되는 동전의 개수(coin_kind[i]) 확인
			coin_value[i] = T / coin[i];
			System.out.println(coin[i] + "원: " + coin_value[i] + "개");
		
			T = T - coin[i] * coin_value[i]; // 남은 거스름돈 계산
		
		}

		return T;
	}// end of method()

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("거슬러 주어야하는 금액:");
		int t = Integer.parseInt(br.readLine());

		System.out.print("동전의 수: ");
		int n = Integer.parseInt(br.readLine());

		int[] coin = new int[n]; // 동전의 종류
		int[] coin_value = new int[coin.length]; // 거스름돈으로 돌려줄 동전의 개수

		for (int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}

		int coinChange = coin_change(t, n, coin, coin_value);
		System.out.println(coinChange);
	}
}