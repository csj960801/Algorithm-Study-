package 탐색알고리즘;

/**
 * 합병 정렬 응용 알고리즘(교과서:42p)
 * 
 * @author CSJ
 *
 */
public class MergeSort {

	/**
	 * @param arr
	 * @param left
	 * @param right
	 */
	private static void mergeSortDevide(int[] arr, int left, int right) {

		/* 원소의 수가 2개 이상일경우 실행 */
		if (left < right) {

			/* 반으로 나누기 위한 변수 */
			int mid = (left + right) / 2;

			/* 앞(왼쪽)부분 재귀 호출 */
			mergeSortDevide(arr, left, mid);

			/* 뒤(오른쪽)부분 재귀 호출 */
			mergeSortDevide(arr, mid + 1, right);

			/* 원소를 Merge하는 함수 */
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {

		// left변수를 2개를 만드는 이유는 기존 매개변수left를 그대로 적용시킨다면 값이 지속적으로 변하는 이유임.
		int left_second = left; // 0
		int j = mid + 1; // 중간값의 다음 값
		int temp_index = left;// 0

		// 리턴 대기 시킬 배열
		int[] temp = new int[arr.length];

		// 처음부터 중간까지의 값을 나누고 중간 다음 값(mid+1)부터 마지막 값(배열의 크기의 끝)까지 나눔.
		while (left_second <= mid && j <= right) {
			// 중간값이 앞쪽 값보다 크다면
			if (arr[left_second] < arr[j]) {
				// 앞쪽 값을 증가시킨 배열값을 리턴시킬 다른 그릇으로 옮겨 놓도록하고
				temp[temp_index++] = arr[left_second++];
			} else {
				// 앞쪽 값이 중간값보다 크다면 그대로 리턴시킬 그릇으로 적용
				temp[temp_index++] = arr[j++];
			}
		}

		/* 앞(왼쪽)부분 배열에 원소가 남아있는 경우 */
		while (left_second <= mid) {
			temp[temp_index++] = arr[left_second++];
		}

		/* 뒤(오른쪽)부분 배열에 원소가 남아있는 경우 */
		while (j <= right) {
			temp[temp_index++] = arr[j++];
		}

		for (int index = left; index < temp_index; index++) {
			arr[index] = temp[index];
		}
	}

	private static void output_merge_arr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] arr = { 10, 80, 91, 90, 70 };

		/* 원소를 반으로 나누는 함수 */
		// 초기 세팅 변수 arr={데이터}, left = 0 , right = 배열 길이-1 , mid = (left+right)/2
		mergeSortDevide(arr, 0, arr.length - 1);

		/* 합병 정렬된 배열을 출력하는 함수 */
		output_merge_arr(arr);
	}

}