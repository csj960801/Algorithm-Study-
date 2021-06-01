package _2021_05_31;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GreedyPattern {

	/**
	 * 
	 * @param n      => 물체의 수
	 * @param value  => 물체의 가치
	 * @param weight => 물체의 무게
	 * @param br
	 * @return
	 * @throws Exception
	 */
	public int[] greedypattern(int n, int[] value, int[] weight, BufferedReader br) throws Exception {

		int itemValue = 0;
		int[] itemValueArr = new int[n];

		// 배낭의 무게
		System.out.print("배낭의 무게: ");
		int maxWeight = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			System.out.print("물체의 이익: ");
			value[i] = Integer.parseInt(br.readLine());

			System.out.print("물체의 무게: ");
			weight[i] = Integer.parseInt(br.readLine());

			itemValue = value[i] / weight[i];// 상품의 가치

			// 배낭의 무게가 차있지 않다면 배낭무게에서 상품의 무게를 빼고 가치합산.
			if (maxWeight > weight[i]) {
				itemValueArr[i] = value[i];
				itemValue += itemValueArr[i];
				maxWeight -= weight[i];
			}

			// 상품의 무게가 배낭의 무게를 초과할 경우
			if (maxWeight < weight[i]) {
				System.out.println("배낭의 무게를 초과하였습니다.");
				System.out.println("가치: " + itemValue);
				break;
			}
		}
		return itemValueArr;
	}// end of greedypattern()

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("물체의 수:");
		int n = Integer.parseInt(br.readLine());

		int[] value = new int[n];// 물체의 가치
		int[] weight = new int[n];// 물체의 무게
		System.out.println("결과: " + Arrays.toString(new GreedyPattern().greedypattern(n, value, weight, br)));
	}

}
