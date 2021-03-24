package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/**
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력: 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는
 * A+B이다.
 * 
 * @author CSJ
 *
 */
public class AB8 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 테스트 케이스 개수
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			//int A = Integer.parseInt(br.readLine());
			//int B = Integer.parseInt(br.readLine());
			bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
			bw.flush();
		}
		bw.close();

	}

}