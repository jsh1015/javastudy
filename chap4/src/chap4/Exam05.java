package chap4;

import java.util.Scanner;

/*
 * �Ѱ��� ���ڸ� �Է¹޾Ƽ� �ҹ����� ���� �빮�ڷ� �����Ͽ� ����ϱ�
 * �ҹ��ڰ� �ƴ� ���� "�ҹ��ھƴ�" ����ϱ�
 * Scanner scan = new Scanner(System.in);
 * String str = scan.next();
 * char ch = str.charAt(0);
 * ch ���� : 	'a'<=ch <='z'
 * �빮�� = �ҹ���-32;
 * [���]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * a
 * A
 * 
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * 1
 * �ҹ��ھƴ�
 */
public class Exam05 {
	public static void main(String[] args) {
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		String str = scan.next(); //���ڿ��� �Է¹ޱ�.
		char ch = str.charAt(0); //���ڿ� �� ù��° ����
		String result = (ch>='a' && ch<='z')? 
						(char)(ch-32)+" " :"�ҹ��ھƴ�";//" "�� �߰��ؼ� String���� �ٲ���
		System.out.println(result);
		System.out.println((ch>='a' && ch<='z')? (char)(ch-32):"�ҹ��ھƴ�" ); //" "�߰� �����൵ ��
	}

}
