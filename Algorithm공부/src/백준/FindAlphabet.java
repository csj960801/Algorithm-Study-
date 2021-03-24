package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 문제: 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 * 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 
 * 출력: 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서
 * 출력한다.
 * 
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째
 * 위치이다.
 * 
 * @author CSJ
 *
 */
public class FindAlphabet {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 소문자로 이루어진 단어
		String S = br.readLine().toLowerCase();

		// 소문자 a-z까지의 값을 배열에 저장
		String[] wordArr = new String[27];
		int cnt = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			cnt++;
			wordArr[cnt] = String.valueOf(i);

			// 배열에 넣은 문자값을 단어 S와 비교해서 포함되어있는 값이 있는 경우
			if (S.indexOf(i) > -1) {
				System.out.println(S.indexOf(i));
			} else {
				System.out.println(S.indexOf(i));
			}
		}
	}

}