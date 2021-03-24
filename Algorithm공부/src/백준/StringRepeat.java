package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번
 * 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 * 
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * 
 * 입력 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
 * 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 * 
 * 출력 각 테스트 케이스에 대해 P를 출력한다.
 * 
 * @author CSJ
 *
 */
public class StringRepeat {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
		int[] R = new int[T];

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < T; i++) {
			R[i] = Integer.parseInt(br.readLine());
			for (int j = 0; j < R[i]; j++) {
				String S = br.readLine();
				for (int r = 0; r < R[i]; r++) {
					sb.append(S);
				}
			}
		}
		System.out.println(sb.toString());
	}
}