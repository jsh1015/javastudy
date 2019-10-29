package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		//화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
		//단 99숫자가 입력될때까지 계속 입력받기
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1부터 10까지의 숫자를 입력하세요(종료:99)");
			//입력값이 숫자가 아닌 경우 : InputMismatchException 발생될경우
			//					숫자만 입력하세요 메세지 출력하고, 다시 입력받도록 프로그램 수정
			try {
				int num = scan.nextInt();
				if(num == 99) break;
				if(num<1 || num>10) { //예외는 아니지만 강제로 예외발생
					throw new Exception("1부터 10까지의 숫자만 입력하세요");
				} 
				System.out.print(num + ":");
				for(int i=1; i<=num; i++) {
					System.out.print("*");
				}
				System.out.println();
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
//				scan = new Scanner(System.in);
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요");
				continue;
			}catch(Exception e) {
				System.out.println(e.getMessage()); //e.getMessage() = "1부터 10까지의 숫자만 입력하세요"
			}
		}System.out.println("프로그램 종료");
	}

}
