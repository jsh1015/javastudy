package chap05;

import java.util.Scanner;

public class 과제01 {

	public static void main(String[] args) {
		
	// 1.
		// A. int형 변수 x가 10보다 크고 20보다 작을때 A를 출력하는 문장
		System.out.println("숫자를 입력하세요");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		if(x > 10 && x < 20) {
			System.out.println("A");
		}
		// B. char 형 변수 ch 가 공백이나 탭이 아닐때 B를 출력하는 문장
		// C. char 형 변수 ch가 'x'또는 'X'일때 C를 출력하는 문장
		System.out.println("문자를 입력하세요");
		Scanner b = new Scanner(System.in);
		char ch = b.next().charAt(0);
		if(ch=='x' || ch=='X') {
			System.out.println("C");
		}else if(ch!='\n' && ch!='\t') {
				System.out.println("B");
		}

		// D. boolean 형 변수 powerOn이 false인 경우 D를 출력하는 문장
		System.out.println("boolean");
		Scanner c = new Scanner(System.in);
		boolean powerOn = c.hasNext();
		if(powerOn == false) {
			System.out.println("D");
		}
	/*	if(!powerOn){
	 * 		System.out.println("D");
	 * 	}*/	
		
		// E.
		System.out.println("문장을 입력하세요");
		Scanner d = new Scanner(System.in);
		//String str = "yes";
		String str = d.nextLine();
		if(str.equals("yes")) {
			System.out.println("E");
		}
		
	// 2.
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result;
		switch(num/10){
		case 10:
		case 9:
		case 8:
		case 7:
		case 6: result = "합격"; break;
		default : result = "불합격"; break;
		}
		System.out.println(result);
		
		
	// 3.
		System.out.println("for문으로 1~100까지의 짝수합 구하기");
		int i = 1;
		int sum = 0;
		for(i=1; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		System.out.println("while문으로 1~100까지의 짝수합 구하기");
		i = 0;
		sum = 0;
		while(i<100) {
			i +=2 ;
			sum += i;
		}
		System.out.println(sum);
		
		
		System.out.println("do-while문으로 1~100까지의 짝수합 구하기");
		i = 0;
		sum = 0;
		do {
			sum += i;
			i += 2;
		}while(i<=100);
		System.out.println(sum);
	}

}
