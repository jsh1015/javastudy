package chap05;

import java.util.Scanner;

/*
 * ȭ�鿡 �ﰢ���� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ�
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���
 * 3
 * 	***
 * 	**
 * 	*
 */
public class Exam10 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i=1; i<=num; i++) {
			for(int j=h; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}