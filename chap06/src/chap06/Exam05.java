package chap06;

import java.util.Scanner;

/*
 * 10������ �Է¹޾� 8������ ����ϱ�
 */
public class Exam05 {

	public static void main(String[] args) {
		int[] a = new int[32];
		System.out.println("8������ ��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int a1 = num;
		int cnt =0;
		
		while(a1 != 0) {
			a[cnt++] = a1%8;
			a1 /= 8;
		}
		System.out.print("10���� " + num +"�� 8������ : ");
		for(int i=cnt-1; i>=0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
