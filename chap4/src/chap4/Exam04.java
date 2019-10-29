package chap4;

import java.util.Scanner;

/*
 * 숫자를 입력받아 양수인 경우는 양수로, 음수인 경우는 음수로, 0인경우는 0출력하기
 */
public class Exam04 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String result = (a>0?"양수":a<0?"음수":"0");
		System.out.println(result);
	}
}