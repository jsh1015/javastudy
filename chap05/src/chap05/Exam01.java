package chap05;

import java.util.Scanner;
/*
 * 조건문 if를 이용하여
 * 숫자를 입력받아서 양수인 경우 양수, 음수인경우 음수, 0인경우 0 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a>0) {
			System.out.println("양수");
		}else if(a<0) {
			System.out.println("음수");
		}else {
			System.out.println(0);
		}
	}
}