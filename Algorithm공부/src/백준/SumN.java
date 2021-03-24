package 백준;

/**
 * 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 * 
 * @author CSJ
 *
 */
public class SumN {

	// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열
	public long sum(int[] a) {

		int value = 0;
		for (int i = 0; i < a.length; i++) {
			value = value + a[i];
		}
		long ans = Long.parseLong(Integer.toString(value));
	
		// 리턴값: a에 포함되어 있는 정수 n개의 합
		return ans;
	}

	public static void main(String[] args) {

		SumN sn = new SumN();

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sn.sum(a));
	}

}
