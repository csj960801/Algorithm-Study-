package 학습용;

import java.io.*;
import java.util.Arrays;

public class FindMiddle {

	public static String middleValue(String[] str, int n, String k) {
		Arrays.sort(str);
		String result = "";

		// 초깃값 설정
		int left = 0;
		int right = n;
		int middle = (left + right) / 2;

		for (int i = 0; i < n; i++) {
			// 키 값을 찾지 못할경우 오른쪽값을 1씩 감소시키며 서칭
			if (!k.equals(str[middle])) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}

			// 서칭값과 위치 반환
			if (k.equals(str[i])) {
				System.out.println(str[i] + " 값 존재합니다. " + middle);
				result = String.valueOf(middle);
			}

		}
		return result;
	};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력할 문자열의 수:");
		int n = Integer.parseInt(br.readLine());

		System.out.print("찾을 값: ");
		String k = br.readLine();

		String[] str = new String[n];

		System.out.print("입력할 문자:");
		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}

		System.out.println("결과: " + middleValue(str, n, k) + "번째에 존재함.");
	}
}