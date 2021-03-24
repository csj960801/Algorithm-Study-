package 백준;

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 입력: 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 * 입력의 마지막에는 0 두 개가 들어온다.
 * 
 * 출력: 각 테스트 케이스마다 A+B를 출력한다.
 * 
 * @author CSJ
 *
 */
public class AB5 {

	public static void main(String[] args) throws Exception {
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			result = A + B;
			if (A == 0 && B == 0) {
				break;
			}
			System.out.println(result);
			// bw.write(result + "\n");
		}
		// bw.flush();
		// bw.close();
	}

}
