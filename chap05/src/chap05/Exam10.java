package chap05;

import java.util.Scanner;

/*
 * 화면에 삼각형의 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이를 입력하세요
 * 3
 * 	***
 * 	**
 * 	*
 */
public class Exam10 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i=1; i<=num; i++) {
			for(int j=h; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
