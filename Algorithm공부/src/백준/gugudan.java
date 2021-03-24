package 백준;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n <= 1 || n >= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
			}
		}

	}

}
