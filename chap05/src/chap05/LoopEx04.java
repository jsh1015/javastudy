package chap05;

import java.util.Scanner;

/*
 * ���� ���߱� ����
 * ��ǻ�Ͱ� 1���� 100������ ������ ���� �����ϰ� �ְ�,
 * ����ڴ� �ݺ������� ���ڸ� �Է��ؼ� ����� ���ڸ� ���߱�
 * ���ڸ� ���߸� ���α׷� �����ϱ�
 */
public class LoopEx04 {

	public static void main(String[] args) {
		// 1. ��ǻ���� ������ �� ����
		int ans = (int)(Math.random()*100)+1;
		/*	Math.random() : ����. ������ �� 
		 * 			0 <= Math.random()< 1.0
		 * 			0 <= Math.random()*100< 100.0
		 * 			0 <= (int)Math.random()*100< 100 ->99����
		 * 			0 <= (int)Math.random()*100 + 1 < 100 ->100����
		 */
		//ans : 1���� 100������ ������ �� �����ϴ� ����
		Scanner scan = new Scanner(System.in);
		int input;
		int count = 0 ;
		do {
			System.out.println("1~100������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			count+=1;
			if(ans>input) {
				
				System.out.println("�� ū�� �Դϴ�.");
			}else if(ans<input) {
				
				System.out.println("�� ������ �Դϴ�.");
			}else {
				System.out.println("�Է� Ƚ�� :" +count+ "\n"+ "�����Դϴ�.");
			}
		}while(ans!=input);
	}

}
