package 학습용;

import java.io.*;

/**
 * 카카오에 신입 개발자로 입사한 “콘”은 선배 개발자로부터 개발 역량 강화를 위해 다른 개발자가 작성한 소스 코드를 분석하여 문제점을
 * 발견하고 수정하라는 업무 과제를 받았습니다. 소스를 컴파일하여 로그를 보니 대부분 소스 코드 내 작성된 괄호가 개수는 맞지만 짝이 맞지
 * 않은 형태로 작성되어 오류가 나는 것을 알게 되었습니다. 수정해야 할 소스 파일이 너무 많아서 고민하던 “콘”은 소스 코드에 작성된 모든
 * 괄호를 뽑아서 올바른 순서대로 배치된 괄호 문자열을 알려주는 프로그램을 다음과 같이 개발하려고 합니다.
 * 
 * 
 * ‘(‘ 의 개수와 ‘)’ 의 개수가 같다면 이를 균형잡힌 괄호 문자열. 여기에 ‘(‘와 ‘)’의 괄호의 짝도 모두 맞을 경우에는 이를
 * 올바른 괄호 문자열.
 * 
 * 예를 들어, "(()))("와 같은 문자열은 “균형잡힌 괄호 문자열” 이지만 “올바른 괄호 문자열”은 아닙니다. 반면에 "(())()"와
 * 같은 문자열은 “균형잡힌 괄호 문자열” 이면서 동시에 “올바른 괄호 문자열”
 * 
 * @author CSJ
 *
 */
public class GualhoProblem {

	/**
	 * 출제의도:주어진 로직을 그대로 구현할 수 있는지 파악, 재귀함수를 이해하고 작성할 수 있는지 파악
	 * 
	 * @param p
	 * @return
	 */
	public static String solution(String p) {
		String result = "";

		StringBuffer u = new StringBuffer(); // 균형잡힌 괄호 문자열(분리불가)
		StringBuffer v = new StringBuffer(); // 빈 문자열도 가능함.

		int left = 0;
		int right = 0;

		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) == '(') {
				left++;
			} else if (p.charAt(i) == ')') {
				right++;
			} else {
				break;
			}

			// 짝이 맞는지 확인
			if (left == right) {
				System.out.println("균형잡힌 괄호 문자열");
				
			} else {
				System.out.println("균형이 잡혀있지 않은 괄호 문자열");
				break;
			}
		}
		return result;
	}// end of solution()

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("생성하실 괄호들을 입력해주세요.");
		String p = br.readLine();

		// 입력이 빈 문자열인 경우, 빈 문자열 반환
		if (p.equals("")) {
			p = "";
			return;
		}
		System.out.println("결과:" + solution(p));
	}
}