package chap05;

import java.util.Scanner;

/*
 * Ű���忡�� �Ѱ��� ���ڸ� �Է¹޾Ƽ� �빮��, �ҹ���, ����, ��Ÿ �������� ����ϱ�
 * [���]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * A
 * �빮�� ('A'<=ch <='Z')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * c
 * �ҹ��� ('a'<=ch <='z')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * 3
 * ���� ('0'<=ch <='9')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * -
 * ��Ÿ����
 */
public class Exam02 {
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		if(ch>='A' && ch<='Z') {
			System.out.println("�빮��");
		}else if(ch>='a' && ch<='z') {
			System.out.println("�ҹ���");
		}else if(ch>='0' && ch<='9') {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ����");
		}
	}
}
