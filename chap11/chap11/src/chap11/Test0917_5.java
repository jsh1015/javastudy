package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 1. 임의의 수 저장
 * 2. 반복문으로 데이터 입력받기.
 * 		정답과 비교
 * 3. 입력 횟수 증가
 */

public class Test0917_5 {
	public static void main(String[] args) throws Exception {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			System.out.print(" * 숫자를 입력하세요 : ");
			try{
				int a = scan.nextInt();
				cnt++;
				if(a<1 || a>100) {
					throw new Exception("\t(오류) 1과 100사이의 숫자만 입력하세요");
				}else if(a > num) {
					System.out.println("\t"+ a + " 보다 작은수 입니다.");
				}else if(a < num) {
					System.out.println("\t"+ a + " 보다 큰 수 입니다.");
				}
				if(a == num) {
					System.out.println(cnt + "번입력. 정답입니다.");
					break;
				}
			}catch(InputMismatchException e1) {
				cnt++;
				System.out.println("\t(오류) 숫자만 입력하세요");
				String str = scan.next();
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}
