package chap4;

import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리정수를 입력하세요
 * 321
 * 300
 */
public class Exam02 {

	public static void main(String[] args) {
		int a;
		System.out.println("세자리 정수를 입력하세요");
		Scanner result = new Scanner(System.in);
		a = result.nextInt();
		System.out.println(a-a%100);
	}
}
