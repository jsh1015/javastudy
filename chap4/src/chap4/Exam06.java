package chap4;

import java.util.Scanner;

/*
 * ����� ��� ���ڿ� ���� �Ѵ�. 1���� ���ڿ� 10���� ����� ���� �� �ִ�.
 * �ʿ��� ��� ������ ������ ����ϱ�
 * [���]
 * ����� ������ �Է��ϼ���
 * 22
 * �ʿ��� ������ ���� : 3
 * 
 * 30
 * �ʿ��� ������ ���� : 3
 */
public class Exam06 {
	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		//int result = (a%10>0 ? (a/10)+1 : a/10);
		int result = (a%10>=1)?1:0;
		System.out.println("�ʿ��� ������ ���� :"+ (a/10 + result));
	}
}
