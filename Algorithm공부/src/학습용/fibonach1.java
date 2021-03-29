package 학습용;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class fibonach1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("피보나치 수열에 적용 할 값: ");
		int n = Integer.parseInt(br.readLine());

		// 초깃값
		int firstValue = 1;
		int firstValue2 = 0;

		int result = 0;
		for (int index = 0; index <= n; index++) {
			result = firstValue + firstValue2;
			firstValue2 = firstValue;
			firstValue = result;
			System.out.println("결과: " + result);
		}
	}

}