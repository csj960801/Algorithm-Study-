package _2021_05_11;

import java.io.*;
import java.util.Arrays;

/**
 * 10진수를 2진수로 변환하고 1과 1사이 0의 갯수 구하기
 * 
 * @author CSJ
 *
 */
public class BinaryGap {

	public static int solution(int N) {
		String binary = Integer.toBinaryString(N);
		char[] arr = binary.toCharArray();
		int gapResult = 0;
		int gapLength = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				
			}
			if (arr[i] != '0') {
				gapResult = 0;
			}
		}
		return gapResult;

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.println(solution(n));
	}
}