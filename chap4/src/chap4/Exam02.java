package chap4;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է¹޾� 100�ڸ� �̸��� ������ ����ϱ�
 * [���]
 * ���ڸ������� �Է��ϼ���
 * 321
 * 300
 */
public class Exam02 {

	public static void main(String[] args) {
		int a;
		System.out.println("���ڸ� ������ �Է��ϼ���");
		Scanner result = new Scanner(System.in);
		a = result.nextInt();
		System.out.println(a-a%100);
	}
}
