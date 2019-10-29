package chap04;

import java.util.Scanner;
/*
 * 산술연산
 * 	/ : 나누기 연산자
 * 		정수 = 정수/정수
 *  % : 나머지 연산자
 *  	나머지 연산 결과값의 부호는 피젯수의 부호와 같다.
 */
public class OpEx06 {
	public static void main(String[] args) {
		System.out.println(10/8); //1
		System.out.println(10/-8); //-1
		System.out.println(-10/8); //-1
		System.out.println(-10/-8); //1
		System.out.println(10%8); //2
		System.out.println(10%-8); //2
		System.out.println(-10%8); //-2
		System.out.println(-10%-8); //-2
		// 1. 12345초가 몇시간 몇분 몇초인지 출력하기
		int num = 12345;
		//키보드에서 입력받기
		System.out.println("계산할 초를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num/3600+"시간"+(num%3600)/60+"분"+num%60+"초");
	}
}
