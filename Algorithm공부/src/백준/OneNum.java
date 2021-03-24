package 백준;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을
 * 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 입력 1 110 210
 * 출력 1 99  105
 * 
 * @author CSJ
 *
 */
public class OneNum {

	// 등차수열 식 구현
	public static int N(int x) {
		int cnt = 0;

		/**
		 * 1 ~ 99 의 경우 그 수 자체가 수열이라고 했다. 즉, 케이스를 x가 100 보다 작은 경우와 큰 경우를 나눈다. x가 100 보다
		 * 작을경우는 x 을 return 해주면 된다.
		 */
		if (x < 100) {
			return x;
		}

		/**
		 * 100 이상의 수가 들어오면 한수의 최소 개수는 99개다. 그러므로 cnt = 99 로 초기화 해준다.
		 * 
		 * 그리고 가장 중요한 것. 입력 값 중 최댓값은 1000이다. 그런데 1000 은 어차피 등차수열도 아닐 뿐더러 1000보다 큰 수는
		 * 입력받지 않기 때문에 num 이 1000 일 경우 num = 999로 변경
		 */
		else {
			cnt = 99;
			if (x == 1000) {
				x = 999;
			}

			/**
			 * a = 백의 자리
			 * b = 십의 자리 
			 * c = 일의 자리
			 */
			for (int i = 100; i <= x; i++) {
				int a = i / 100;
				int b = (i / 10) % 10;
				int c = i % 10;
				if ((a - b) == (b - c)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = N(n);
		System.out.println(x);

	}
}