package 학습용;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 최대값 구하는 알고리즘 응용(교과서 8p)
 * 
 * @author CSJ
 *
 */
public class Maximum {

	public static void main(String[] args) throws Exception {

		// Scanner보다 실행 시간이 빠름.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		/**
		 * 배열은 같은 자료형을 갖는 여러 원소(데이터)를 하나의 변수이름으로 모아놓은 데이터의 집합이다.
		 * 장점: 표현이 간단하며 순서에 따른 순차적 원소 접근이 아닌 인덱스를 사용해서 임의적인 접근이 가능함.
		 * 단점: 원소들이 순차적으로 저장되기 때문에 데이터의 삽입과 삭제가 발생하는 경우 시간적인 오버헤드가 발생함.
		 */
		int[] NumArr = new int[n];

		int max = NumArr[0];
		for (int i = 0; i < n; i++) {
			NumArr[i] = Integer.parseInt(br.readLine());
			if (max < NumArr[i]) {
				max = NumArr[i];
			}
		}
		System.out.println(max);
		br.close();
	}

}