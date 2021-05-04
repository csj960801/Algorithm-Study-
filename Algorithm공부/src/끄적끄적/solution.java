package 끄적끄적;

import java.util.*;

/**
 * 제한사항 clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다. 스파이가 가진 의상의 수는 1개 이상 30개
 * 이하입니다. 같은 이름을 가진 의상은 존재하지 않습니다. clothes의 모든 원소는 문자열로 이루어져 있습니다. 모든 문자열의 길이는
 * 1이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다. 스파이는 하루에 최소 한 개의 의상은 입습니다.
 * 
 * @author CSJ
 *
 */
public class solution {

	public static void main(String[] args) {

		int answer = 0;
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		Map<Integer, Object> map = new HashMap<Integer, Object>();

//		yellow_hat
//		blue_sunglasses
//		green_turban
		for (int i = 0; i < clothes.length; i++) {
			// System.out.println(clothes[i][0]);
			map.put(i, clothes[i][0]);

		}
		answer = map.size();
		System.out.println(answer);
	}

}
