package chap4;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾� ����� ���� �����, ������ ���� ������, 0�ΰ��� 0����ϱ�
 */
public class Exam04 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String result = (a>0?"���":a<0?"����":"0");
		System.out.println(result);
	}
}