package chap05;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고 있고,
 * 사용자는 반복적으로 숫자를 입력해서 저장된 숫자를 맞추기
 * 숫자를 맞추면 프로그램 종료하기
 */
public class LoopEx04 {

	public static void main(String[] args) {
		// 1. 컴퓨터의 임의의 수 저장
		int ans = (int)(Math.random()*100)+1;
		/*	Math.random() : 난수. 임의의 수 
		 * 			0 <= Math.random()< 1.0
		 * 			0 <= Math.random()*100< 100.0
		 * 			0 <= (int)Math.random()*100< 100 ->99까지
		 * 			0 <= (int)Math.random()*100 + 1 < 100 ->100까지
		 */
		//ans : 1부터 100사이의 임의의 수 저장하는 변수
		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0 ;
		do {
			System.out.println("1~100사이의 숫자를 입력하세요");
			input = scan.nextInt();
			count+=1;
			if(ans>input) {
				
				System.out.println("더 큰수 입니다.");
			}else if(ans<input) {
				
				System.out.println("더 작은수 입니다.");
			}else {
				System.out.println("입력 횟수 :" +count+ "\n"+ "정답입니다.");
			}
		}while(ans!=input);
	}

}
