package chap05;

import java.util.Scanner;

/*
 * ȭ�鿡 �ﰢ���� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ�
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 3
 * 	*
 *  **
 *  ***
 * �ﰢ���� ���̸� �Է��ϼ���
 * 5
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */
public class Exam09 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
