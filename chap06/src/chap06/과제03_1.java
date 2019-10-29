package chap06;

import java.util.Scanner;

public class 과제03_1 {

	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int bottom = len*2-1;
		int sum = 0;
		int data = 0;
		for(int i=bottom; i>=1;i-=2) {
			data += i;
		}
		int m = bottom/2;
		for(int i = 0; i < len; i++) {
			for(int j=0; j < bottom;j++) {
				if(j>=m-i && j<=m+i)
					System.out.print(data-- + "\t");
				else
					System.out.print("\t");
			}
			System.out.println();			
		}
	}

}
