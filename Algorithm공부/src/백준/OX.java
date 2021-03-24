package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 문제: "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그
 * 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * 
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * 
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이
 * 주어진다. 문자열은 O와 X만으로 이루어져 있다.
 * 
 * 출력: 각 테스트 케이스마다 점수를 출력한다.
 * 
 * @author CSJ
 *
 */
public class OX {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArr = new String[Integer.parseInt(br.readLine())];

		int result = 0;
		int cnt = 0;
		// strArr 배열 안에 있는 데이터의 수 만큼 루프가 돌고
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = br.readLine();

			// strArr배열 안에 입력받은 데이터중에서 O가 있는지 문자분석 진행 후,
			// O가 있는 경우 cnt를 증가 시키고 도중에 O가 아닌 값이 있을 경우 0으로 초기화 시키도록하자.
			for (int j = 0; j < strArr[i].length(); j++) {
				if (strArr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				result = result + cnt;
			}
			// 증명
			System.out.println(result);
		}
	}
}