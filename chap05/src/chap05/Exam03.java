package chap05;
import java.util.Scanner;

/*
 * ���� ���ϱ�
 * 		1. �⵵�� 4�� ����� ���
 * 			400�� ����� : ����
 * 			100�� ����� : ���
 * 			100�� ����� �ƴ� ��� : ����
 * 		2. �⵵�� 4�� ����� �ƴ� ��� -> ���
 * [���]
 * �⵵�� �Է��ϼ���
 * 2019
 * ����Դϴ�.
 * 2004
 * �����Դϴ�.
 */
public class Exam03 {
	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%4==0) {
			if(num%400==0) {
				System.out.println("�����Դϴ�.");
			}else if(num%100==0) {
				System.out.println("����Դϴ�.");
			}else{
				System.out.println("�����Դϴ�.");
			}
		}else {
			System.out.println("����Դϴ�.");
		}
	}

}
