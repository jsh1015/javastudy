package chap04;

import java.util.Scanner;

/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Է¼����� ũ�ų� ���� ���� ���� 10�� ����� ���ϱ�
 * 10�� ����� �Է¼��� �� ���� ����ϱ�
 * [���]
 * 10���� 99������ ���� �Է��ϼ���
 * 24
 * 30 - 24 = 6
 * 10���� 99������ ���� �Է��ϼ���
 * 20
 * 20 - 20 = 0
 * 10���� 99������ ���� �Է��ϼ���
 * 77
 * 80 - 77 = 3
 */
public class Exam08 {
	public static void main(String[] args) {
		System.out.println("10���� 99������ ���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int result = (a/10 + (a%10 >=1?1:0))*10;
		System.out.println(result+ " - " + a + " = " + (result-a))  ;
	}
}
