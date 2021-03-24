package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 * 
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 * 
 * 출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 * 
 * @author CSJ
 *
 */
public class LessThanX {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스 개수
		int N = Integer.parseInt(br.readLine());

		// 작은 수를 출력하기 위해 기준이 되는 수
		int X = Integer.parseInt(br.readLine());

		// 수열
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int result : arr) {
			if (result < X) {
				bw.write(result + " ");
				bw.flush();
			}
			bw.close();
		}
		
	}

}
