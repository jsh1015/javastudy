package chap05;

import java.util.Scanner;

public class Exam11 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=num; j++) {
				if(i>j) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
