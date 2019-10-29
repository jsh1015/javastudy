package chap06;

import java.util.Scanner;

/*
 * 10진수를 입력받아 8진수로 출력하기
 */
public class Exam05 {

	public static void main(String[] args) {
		int[] a = new int[32];
		System.out.println("8진수로 변환할 10진수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a1 = num;
		int cnt =0;
		
		while(a1 != 0) {
			a[cnt++] = a1%8;
			a1 /= 8;
		}
		System.out.print("10진수 " + num +"의 8진수는 : ");
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
