package chap05;

import java.util.Scanner;

public class 과제02 {

	public static void main(String[] args) {
		// 1. 방정식 2x+4y=10의 모든 해를 구하는 프로그램을 작성하시오
		//	    단 x와 y는 정수이고, 각각의 범위는 0<=x<=10, 0<=y<=10
		int x, y;
		for(x=0; x<=10; x++) {
			for(y=0; y<10; y++)
				if(x*2 + y*4 == 10) {
					System.out.println("x="+ x +","+ "y=" + y);
				}
		}
		// 2. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를
		//	    출력하는 프로그램 작성
		int i, j;
		for(i=1;i<=6;i++) {
			for(j=1; j<=6; j++) {
				if(i+j ==6) {
					System.out.println(i+","+j);
				}
			}
		}
		
		// 3. 강아지, 병아리의 합과 다리수의 합을 받아서 강아지의 마리수와
		// 	    병아리의 마리수를 출력하기. 계산이 안될 경우 정답 없음 출력하기
		int x1 = 0; 
		int y1 = 0;
		int X = 0;
		System.out.println("강아지와 병아리의 합계를 입력하세요");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		System.out.println("강아지와 병아리의 다리 합계를 입력하세요");
		Scanner b = new Scanner(System.in);
		int num2 = b.nextInt();
		
		for(x1=0;x1<=num;x1++) {
			for(y1=0;y1<=num;y1++) {
				if(x1 + y1 == num && x1*4 + y1*2 == num2) {
						System.out.println("강아지는"+x1+"마리이고, " +"병아리는"+y1+"마리입니다.");
						X++;
				}
			}
		}
		if(X==0) {
			System.out.println("정답없음");
		}
	}
}
