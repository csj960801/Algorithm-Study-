package 동적프로그래밍알고리즘;

import java.io.*;

public class Floyd {

	public static int[][] D = null;// 인접 간선 초기화 전용 배열

	/**
	 * 최단 경로의 길이 계산 메소드
	 * 
	 * @param G => 그래프 값(V,E)
	 * @return
	 */
	public static int ShortDistanceCalc(int V, int E) {
		D = new int[V][E];
		for (int k = 0; k < D.length; k++) {
			for (int i = 0; i < D[k].length; i++) {
				for (int j = 0; j < D[i].length; j++) {
					D[k][i] = Math.min(D[k][i], D[i][j] + D[j][i]);
					System.out.println(D[k][i]);
				}
			}
		}

		return -1;
	}// end of distanceCalc(V,E)

	public static void main(String[] args) throws Exception {

		// Scanner보다 속도가 빠름.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정점값:");
		int V = Integer.parseInt(br.readLine());

		System.out.print("끝값:");
		int E = Integer.parseInt(br.readLine());

		System.out.println("결과:" + ShortDistanceCalc(V, E));
	}

}
