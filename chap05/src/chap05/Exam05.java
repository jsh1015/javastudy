package chap05;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ڿ����� �Է¹޾Ƽ� ������ �ڸ����� ���� ���ϱ�
 * [���]
 * �ڿ����� �Է��ϼ���
 * 123
 * �ڸ��� �� : 6
 * �ڿ����� �Է��ϼ���
 * 1357
 * �ڸ��� �� : 16
 * [�˰���]
 * num = 123
 * i = num%10
 * sum += i
 * num/=10	 
 */
public class Exam05 {

	public static void main(String[] args) {
		System.out.println("�ڿ����� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		while(num != 0) {
			sum += num%10;
			num /= 10;
		} 
		System.out.println("�ڸ��� �� : " + sum);
	}
}