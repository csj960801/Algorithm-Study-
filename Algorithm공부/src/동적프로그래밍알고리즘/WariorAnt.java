package 동적프로그래밍알고리즘;

import java.io.*;

/**
 * 개미 전사는 부족한 식량을 충당하고자 메뚜기 마을의 식량창고를 몰래 공격하려고 한다.
 * 
 * 메뚜기 마을에는 여러 개의 식량창고가 있는데 식량창고는 일직선으로 이어져 있다 각 식량창고에는 정해진 수의 식량을 저장하고 있으며
 * 
 * 개미 전사는 식량창고를 선택적으로 약탈하여 식량을 빼앗을 예정이다.
 * 
 * 이때 메뚜기 정찰병들은 일직선상에 존재하는 식량창고 중에서 서로 인접한 식량창고가 공격받으면 바로 알아챌 수 있다.
 * 
 * 따라서 개미 전사가 정찰병에 들키지 않고 식량창고를 약탈하기 위해서는 최소한 한 칸 이상 떨어진 식량창고를 약탈해야 한다
 * 
 * @author CSJ
 *
 */
public class WariorAnt {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 털 창고번호
		int n = Integer.parseInt(br.readLine());
		if (n == 1 || n == 0) {
			return;
		}

		// 창고
		int[] supplydepot = new int[n];
		for (int i = 0; i < supplydepot.length; i++) {
			supplydepot[i] = Integer.parseInt(br.readLine());
		}
		// Arrays.sort(supplydepot);

		// 동적 프로그래밍 적용
		int[] table = new int[n];

		// 초깃값
		table[0] = supplydepot[0];
		table[1] = supplydepot[1];

		for (int i = 2; i < n; i++) {
			// 1칸 옆에 있는 창고를 털어주자
			System.out.println("supplydepot[i]: " + supplydepot[i]);
			System.out.println("table[i - 1]: " + table[i - 1]);
			System.out.println("table[i - 2] + supplydepot[i]: " + table[i - 2] + supplydepot[i]);
			table[i] = Math.max(table[i - 1], table[i - 2] + supplydepot[i]);
		}

		System.out.println("결과: " + table[n - 1]);
	}
}