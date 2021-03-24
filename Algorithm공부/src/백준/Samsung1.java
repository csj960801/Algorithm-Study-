package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Samsung1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("실행 케이스:");
		int n = Integer.parseInt(br.readLine());
		int[] K = new int[n];

		for (int i = 0; i < n; i++) {
			K[i] = Integer.parseInt(br.readLine());
		}
	}

}
