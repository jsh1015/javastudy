package chap06;

import java.util.Scanner;

/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 -- 0~9까지 서로다른 수
 * 사용자가 저장된 수를 맞추는 게임
 * 		자리수도 맞는 경우 : 스트라잌
 * 		자리수는 틀리지만 숫자가 존재하면 : 볼
 * 	4스트라잌이 되면 정답
 */
public class Exam09 {

	public static void main(String[] args) {
		int numarr[] = {0,1,2,3,4,5,6,7,8,9};
		// answer : 사용자가 맞춰야할 시스템의 4자리 숫자.
		int answer[] = new int[4];
		//1. 중복되지 않는 4자리수를 생성하기
		for(int i=0;i<10000;i++) {	//섞어주는 것
			int f = (int)(Math.random() * 10);//3
			int t = (int)(Math.random() * 10);//8
			//arr[f], arr[t] 바꾸기.
			int temp = numarr[f];
			numarr[f]=numarr[t];
			numarr[t]=temp;
		}
		for(int i=0;i<answer.length;i++) {
			answer[i]=numarr[i];
		}
		for(int a : answer) {
			System.out.print(a);
		}
		System.out.println();
		//사용자로 부터 정답이 될때까지 4자리 숫자를 입력받기
		Scanner scan = new Scanner(System.in);
		int[] data = new int[4];
		int cnt = 0;
		while(true) {
			//화면에서 4자리 정수 입력
			System.out.println("서로 다른 4자리 숫자를 입력하세요");
			String input = scan.next();	//숫자로 이루어진 문자열
			//"1234"=> data[0]=1, data[1]=2,...
			for(int i=0; i<data.length; i++) {
				data[i] = input.charAt(i)-'0'; //'0'을 빼주면 정수형으로 바뀜
			}
			int strike = 0;
			int ball = 0;
			
			for(int i=0; i<data.length; i++) {
				cnt++;
					if(answer[i] == data[i]) {
						strike++;
					}else{
						for(int j=0; j<data.length; j++) {
							if( answer[i] == data[j])
							ball++;
						}
					}
			}
			/*for(int i=0; i<data.length; i++) {
				for(int j=0; j<data.length; j++) {
					if(answer[i]==data[j]) {
						if(i==j) strike++;
						else ball++;
					}
				}
			}				=== 강사님 답안 	*/
			
			if(strike == 4) {
				System.out.println("정답입니다. 게임을 종료합니다.");
				System.out.println(cnt + "번 입력");
				break;
			}else {
				System.out.println(strike + "스트라익, " + ball + "볼");
			}
			
			/*
			 * if(strike == data.length) {
								System.out.println(cnt + "번 입력");
								System.out.println("정답입니다.");
								break;
			 * System.out.println("strike = " + strike);
			System.out.println("ball = " + ball);
			strike = 0;
			ball = 0;*/
		}
	}

}
