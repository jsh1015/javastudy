package chap05;

import java.util.Scanner;

public class ����01 {

	public static void main(String[] args) {
		
	// 1.
		// A. int�� ���� x�� 10���� ũ�� 20���� ������ A�� ����ϴ� ����
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		if(x > 10 && x < 20) {
			System.out.println("A");
		}
		// B. char �� ���� ch �� �����̳� ���� �ƴҶ� B�� ����ϴ� ����
		// C. char �� ���� ch�� 'x'�Ǵ� 'X'�϶� C�� ����ϴ� ����
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner b = new Scanner(System.in);
		char ch = b.next().charAt(0);
		if(ch=='x' || ch=='X') {
			System.out.println("C");
		}else if(ch!='\n' && ch!='\t') {
				System.out.println("B");
		}

		// D. boolean �� ���� powerOn�� false�� ��� D�� ����ϴ� ����
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
		System.out.println("������ �Է��ϼ���");
		Scanner d = new Scanner(System.in);
		//String str = "yes";
		String str = d.nextLine();
		if(str.equals("yes")) {
			System.out.println("E");
		}
		
	// 2.
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result;
		switch(num/10){
		case 10:
		case 9:
		case 8:
		case 7:
		case 6: result = "�հ�"; break;
		default : result = "���հ�"; break;
		}
		System.out.println(result);
		
		
	// 3.
		System.out.println("for������ 1~100������ ¦���� ���ϱ�");
		int i = 1;
		int sum = 0;
		for(i=1; i<=100; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		System.out.println("while������ 1~100������ ¦���� ���ϱ�");
		i = 0;
		sum = 0;
		while(i<100) {
			i +=2 ;
			sum += i;
		}
		System.out.println(sum);
		
		
		System.out.println("do-while������ 1~100������ ¦���� ���ϱ�");
		i = 0;
		sum = 0;
		do {
			sum += i;
			i += 2;
		}while(i<=100);
		System.out.println(sum);
	}

}
