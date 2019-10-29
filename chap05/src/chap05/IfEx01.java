package chap05;

import java.util.Scanner;
/*
 * if 구문 예제 
 * 
 * 		if(조건식1){
 * 			문장1...: => 조건식1의 결과가 참인 경우 실행되는 문장
 * 		}else {
 * 			문장2...: => 조건식1의 결과가 거짓인 경우 실행되는 문장
 * 		}
 * 
 * 		if(조건식1){
 * 			문장1...: => 조건식1의 결과가 참인 경우 실행되는 문장
 * 		}else if(조건식2){
 * 			문장2...: => 조건식2의 결과가 참인 경우 실행되는 문장
 * 		}else if(조건식3){
 * 			문장3...: => 조건식1, 조건식2의 결과가 거짓이고 조건식3의 결과가 참인 경우 실행되는 문장
 * 		}...
 * 		}else{
 * 			문장 => 모든 if 구문의 결과가 거짓인 경우 실행되는 문장
 * 		}
 * 
 * 		실행되는 문장이 한문장 인 경우 {} 생략 가능
 */

public class IfEx01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if(score>=60) {
			System.out.println("합격을 축하합니다.");
		}else {
			System.out.println("다음에 오세요");
		}
		//90이상 "A" 80이상"B" 70이상 "C" 60이상 "D" 그외는 "F"
		if(score>=90) {
			System.out.println("A학점 입니다.");
		}else if(score>=80) {
			System.out.println("B학점 입니다.");
		}else if(score>=70) {
			System.out.println("C학점 입니다.");
		}else if(score>=60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
	}
}
