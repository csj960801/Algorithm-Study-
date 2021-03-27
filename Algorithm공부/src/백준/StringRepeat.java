package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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

	/*
	 * 예제 입력 1   예제 출력 1
	 * 2 
	 * 3 ABC 	 AAABBBCCC 
	 * 5 /HTP 	 /////HHHHHTTTTTPPPPP
	 */
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); // 테스트 케이스 갯수
		int R = 0; // 문자열 입력 횟수

		// 테스트 케이스 만큼 반복
		for (int i = 0; i < T; i++) {

			StringBuffer P = new StringBuffer();
			R = Integer.parseInt(br.readLine());
			String[] S = new String[R];
			for (int j = 0; j < R; j++) {
				S[j] = br.readLine();
				for(int index = 0; index < R; index++) {
					P.append(S[j].trim());							
				}
			}
		
			System.out.println(P.toString());
		}		
		br.close();
	}// end of main
}