package 백준;

import java.io.*;

/**
 * 문제: 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는
 * 1, 2, 0, 2이다.
 * 
 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 * 
 * 출력: 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
 * 
 * 42 84 252 420 840 126 42 84 420 126 => 1
 * 
 * 39 40 41 42 43 44 82 83 84 85 => 6
 * 
 * @author CSJ
 *
 */
public class another {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int value = 0;
		int cnt = 0; // 다른 나머지의 수 cnt
		boolean[] arr = new boolean[42]; // 나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 boolean 배열 생성

		// 열개의 숫자를 입력 받음
		for (int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine());

			// 입력받은 10개의 숫자들을 42로 나눈 나머지를 구함
			value = (n % 42);

			// 입력받은 값의 % 42 을 통한 나머지 값의 index 을 true 로 바꾸어 준 뒤, 입력이 종료되면 true 값인 배열원소의 개수를
			// 세어준다.
			arr[value] = true;
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == true) {
				cnt++;
			}
		}

		// 증명
		System.out.println(cnt);

	}
}