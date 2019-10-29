package chap4;

import java.util.Scanner;

/*
 * 사과를 사과 상자에 담기로 한다. 1개의 상자에 10개의 사과를 담을 수 있다.
 * 필요한 사과 상자의 갯수를 출력하기
 * [결과]
 * 사과의 갯수를 입력하세요
 * 22
 * 필요한 상자의 갯수 : 3
 * 
 * 30
 * 필요한 상자의 갯수 : 3
 */
public class Exam06 {
	public static void main(String[] args) {
		System.out.println("사과의 갯수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		//int result = (a%10>0 ? (a/10)+1 : a/10);
		int result = (a%10>=1)?1:0;
		System.out.println("필요한 상자의 갯수 :"+ (a/10 + result));
	}
}
