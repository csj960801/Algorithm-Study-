package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberHap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

		int result = 0;

		// 문자열을 byte 배열 타입으로 변환 하는 과정에서
		// UTF-16 인코딩으로 변경되는 과정을 거친다.
		// 그래서, '0'혹은 48을 빼주어야한다.
		for (byte value : br.readLine().getBytes()) {
			result = result + (value - '0');
		}
		System.out.println(result);
	}
}