package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ݾ��� �Է¹޾� 500,100,50,10,1���������� �ٲٱ�
 * �ʿ��� ������ ������ ����ϱ�
 * [���]
 * �ݾ��� �Է��ϼ���
 * 5641
 * 500�� : 11��
 * 100�� : 1��
 * 50�� : 0��
 * 10�� : 4��
 * 1�� : 1��
 */
public class Exam03 {
	public static void main(String[] args) {
		int num;
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println("500�� : " + num/500 + "��");
		System.out.println("100�� : " + (num%500)/100 + "��");
		System.out.println("50�� : " + (num%100)/50 + "��");
		System.out.println("10�� : " + (num%50)/10 + "��");
		System.out.println("1�� : " + (num%10) + "��");
	}
}