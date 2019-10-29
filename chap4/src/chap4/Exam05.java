package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기
 * 소문자가 아닌 경우는 "소문자아님" 출력하기
 * Scanner scan = new Scanner(System.in);
 * String str = scan.next();
 * char ch = str.charAt(0);
 * ch 범위 : 	'a'<=ch <='z'
 * 대문자 = 소문자-32;
 * [결과]
 * 한개의 문자를 입력하세요
 * a
 * A
 * 
 * 한개의 문자를 입력하세요
 * 1
 * 소문자아님
 */
public class Exam05 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); //문자열로 입력받기.
		char ch = str.charAt(0); //문자열 중 첫번째 문자
		String result = (ch>='a' && ch<='z')? 
						(char)(ch-32)+" " :"소문자아님";//" "를 추가해서 String으로 바꿔줌
		System.out.println(result);
		System.out.println((ch>='a' && ch<='z')? (char)(ch-32):"소문자아님" ); //" "추가 안해줘도 됨
	}

}
