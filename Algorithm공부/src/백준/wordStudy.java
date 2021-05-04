package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 문제 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
 * 소문자를 구분하지 않는다.
 * 
 * 입력 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 
 * 출력 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를
 * 출력한다.
 * 
 * 
 * 예제 입력 1 Mississipi 예제 출력 1 ?
 * 
 * 예제 입력 2 zZa 예제 출력 2 Z
 * 
 * 예제 입력 3 z 예제 출력 3 Z
 * 
 * 예제 입력 4 baaa 예제 출력 4 A
 * 
 * @author CSJ
 *
 */
public class wordStudy {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();// 문자열입력

		String result = "";
		if (word.length() == 1) {
			result = word;
		}

		String[] strArray = word.toLowerCase().split("");// 대문자를 입력받을 경우 소문자로 변경하여 비교하도록함.
		Arrays.sort(strArray);// a ~ z 순으로 정렬

		String first = strArray[0]; // 처음 배열값
		String second = strArray[1];// 두번째 배열값

		int Counter = 0;
		for (int i = 2; i < strArray.length; i++) {
			// char words = word.toLowerCase().charAt(i);
			// 처음 배열값과 두번째 배열값이 동일하다면
			if (first.equals(second)) {
				Counter++; // 카운터 1증가
				result = strArray[Counter]; // strArray[1] 값 출력
				System.out.println("first.equals(second): " + result);
			}
			
			// System.out.println(strArray[i]);
		}
		System.out.println(result.toUpperCase());
	}
}