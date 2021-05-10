package _2021_05_10;

import java.io.*;
import java.util.Arrays;

/**
 * 어느 연못에 엄마 말씀을 좀처럼 듣지 않는 청개구리가 살고 있었습니다. 청개구리는 엄마가 하는 말은 무엇이든 반대로 말하였습니다.
 * 
 * 엄마 말씀 word가 매개변수로 주어질 때, 아래 청개구리 사전을 참고해 반대로 변환하여 return 하도록 solution 메서드를
 * 완성해주세요.
 * 
 * 제한사항
 * 
 * word는 길이가 1이상 1000이하인 문자열입니다.
 * 
 * 알파벳 외의 문자는 변환하지 않습니다.
 * 
 * 알파벳 대문자는 알파벳 대문자로, 알파벳소문자는 알파벳 소문자로 변환합니다.
 * 
 * 입출력 예
 * 
 * word result
 * 
 * I love you Rolev blf
 * 
 * @author CSJ
 *
 */
public class flug_배민코딩테스트 {

	public static String solution(String word) {

		String[] Word = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };

		String[] reversedWord = { "Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K", "J",
				"I", "H", "G", "F", "E", "D", "C", "B", "A" };

		String[] wordbreak = word.split(word);
		for (int i = 0; i < wordbreak.length; i++) {
			
		}

		return word;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();

		System.out.println(solution(word));
	}

}