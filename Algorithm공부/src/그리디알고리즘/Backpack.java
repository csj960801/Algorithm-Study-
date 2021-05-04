package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 배낭문제는 배낭의 용량을 초과하지 않는 범위 내에서 배낭에 들어 있는 물체의 이익의 합이 최대가 되도록 물체를 넣는 방법을 찾는 문제임.
 * 이러한 문제를 해결하기 위한 기본 아이디어는 배낭의 용량이 제한되어 있기 때문에 물체의 무게는 적으면서도 이익이 큰물체를 골라 최대한 넣는
 * 것임.
 * 
 * @author CSJ
 *
 */
public class Backpack {

	/**
	 * 배낭 문제의 최대 이익을 구하시오.
	 * 
	 * 문제 해결 과정 배낭의 용량은 10 이고 물체는 총 4가지가 있다. 그리고 각 물체의 무게(w[3])와 이익(p[3])은 다음과 같다. M
	 * = 10, n = 4, w[n]=(4,3,5,3), p[n]=(14,15,20,9) 값이 주어졌을 경우, 단위 무게의 이익을 먼저
	 * 구해야함.
	 * 
	 * x[n] = p[n] / w[n]을 적용해본다면 x[n]안에 (3.5, 5, 4, 3)값이 들어가게됨.
	 * 
	 * @param w => 물체의 무게
	 * @param p => 물체의 이익
	 * @param M => 배낭의 용량
	 * @param n => 물체의 개수
	 * @param x => 결과를 리턴시키는 역할
	 * @return
	 */
	public static int Knapsack(int w[], int p[], int M, int n, int[] x) {

		int result = 0;
		int bag = 0; // 남은 배낭의 용량

		// 물체의 개수 만큼 반복문 실행
		// (단위 무게당 이익이 큰 순서인 물체 2, 물체3, 물체1, 물체4 순으로 배낭에 넣도록 한다.)
		for (int i = 0; i < n; i++) {
			x[i] = 0;// 리턴값 초기화
			bag = M;// 배낭의 무게 설정
		}

		// 이익이 큰 물건 부터 넣기
		int[] profit = new int[n];
		for (int j = 0; j < n; j++) {
			profit[j] = p[j] / w[j];

			if (bag >= w[j]) {
				// 가치가 큰 물건부터 넣도록함.
				result = result + profit[j];
				System.out.println("가치가 큰 물건 담은 후: " + w[j] + "\n");
				System.out.println("가치가 큰 물건:" + result + "\n");
				bag -= w[j];
			}
			// 배낭에 용량이 없으면 리턴
			else {
				break;
			}
		}
		return result;

	}

	public static void main(String[] args) throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("물체 개수: ");
		int n = Integer.parseInt(input.readLine()); // 물체 수

		System.out.print("배낭의 용량: ");
		int M = Integer.parseInt(input.readLine());// 배낭 용량

		// 물체의 무게 설정
		System.out.println("물체의 무게: ");
		int[] w = new int[n];
		for (int i = 0; i < w.length; i++) {
			w[i] = Integer.parseInt(input.readLine());
		}

		// 물체를 챙길 시 생기는 이익 설정
		System.out.println("물체의 이익: ");
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(input.readLine());
		}

		int[] x = new int[n];// 결과값 리턴
		System.out.println("결과:" + Knapsack(w, p, M, n, x));
	}
}