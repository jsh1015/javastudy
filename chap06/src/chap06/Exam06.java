package chap06;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		char[] data = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F','G'};
		char[] a = new char[32];
		System.out.println("16������ ��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a1 = num;
		int cnt = 0;
		
		while(a1!=0) {
			a[cnt++] = data[a1%16];
			a1 /= 16;
		}
		
		System.out.print("10����" + num + "�� 16���� : ");
		for(int i=cnt-1; i>=0; i--) {
				System.out.println(a[i]);
		}
	}
}
