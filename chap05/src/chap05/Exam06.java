package chap05;

import java.util.Scanner;

/*
 * ���ڷ� �̷���� ���ڿ��� �Է¹޾� �� �ڸ��� ���� ���ϱ�
 * String str = scan.next();
 * str.length() : ���ڿ��� ����
 * str.charAt(����)
 */
public class Exam06 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum += (str.charAt(i)-'0');
		} // '1'�ƽ�Ű�ڵ� �� : 49, '0'�ƽ�Ű�ڵ� �� : 48
		System.out.println(sum);
	}
}
