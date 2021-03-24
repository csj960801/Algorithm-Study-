package 백준;

//import java.io.*;
import java.util.*;

/**
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
 * 
 * 
 */
public class AB4 { // EOF => End Of File 를 묻는 문제
	public static void main(String[] args) /* throws Exception */ {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		int result = 0;

		// IO는 int A = (br.readLine() != null)
		while (sc.hasNextInt()) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A > 0 && B < 10) {
				result = A + B;
			} else {
				break;
			}
			System.out.println(result);
		} // end of while()
	}
}