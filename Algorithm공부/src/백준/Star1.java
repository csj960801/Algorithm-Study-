package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 
 * 입력: 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 * 출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 * @author CSJ
 *
 */
public class Star1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) { // 입력한 테스트 케이스 만큼 줄 생성
			for (int j = T; j > 0; j--) { // 입력한 테스트 케이스 만큼 수를 감소 시킴
				if (j > i) { // 줄어드는 수가 i보다 큰 케이스마다 공백으로 매꾸도록.
					bw.write(" ");
				} else {
					bw.write("*");
				}
			}
			bw.write("\n");
			bw.flush();
		}
		bw.close();

	}

}
