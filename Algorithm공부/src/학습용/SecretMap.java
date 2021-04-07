package 학습용;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 “공백”(“ “) 또는 “벽”(“#”) 두 종류로 이루어져 있다.
 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다.
 * 각각 “지도 1”과 “지도 2”라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다. 
 * 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다. 
 * “지도 1”과 “지도 2”는 각각 정수 배열로 암호화되어 있다. 
 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
 * 
 * 풀이하며: 바이너리 연산자와 비트 연산에 대해 학습 할 수 있었던 문제였었다.
 * 
 * @author CSJ
 *
 */
public class SecretMap {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String[] strArr = new String[n];

		// 비밀지도 위치1
		int[] map1 = { 9, 20, 28, 18, 11 };
		int[] map2 = { 30, 1, 21, 17, 28 };
		String result = "";
		System.out.println("비밀지도1");
		for (int i = 0; i < n; i++) {
			result = Integer.toBinaryString(map1[i] | map2[i]);
			System.out.println(result.replace("0", " ").replace("1", "#"));
		} // end of for1

		System.out.println("\n");

		// 비밀지도 위치2
		int[] mapp1 = { 46, 33, 33, 22, 31, 50 };
		int[] mapp2 = { 27, 56, 19, 14, 14, 10 };
		System.out.println("비밀지도2");
		for (int i = 0; i <= n; i++) {
			strArr[i] = Integer.toBinaryString(mapp1[i] | mapp2[i]).replace("0", " ").replace("1", "#");
			System.out.println(strArr[i]);
		}
	}

}
