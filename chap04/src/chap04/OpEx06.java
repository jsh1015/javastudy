package chap04;

import java.util.Scanner;
/*
 * �������
 * 	/ : ������ ������
 * 		���� = ����/����
 *  % : ������ ������
 *  	������ ���� ������� ��ȣ�� �������� ��ȣ�� ����.
 */
public class OpEx06 {
	public static void main(String[] args) {
		System.out.println(10/8); //1
		System.out.println(10/-8); //-1
		System.out.println(-10/8); //-1
		System.out.println(-10/-8); //1
		System.out.println(10%8); //2
		System.out.println(10%-8); //2
		System.out.println(-10%8); //-2
		System.out.println(-10%-8); //-2
		// 1. 12345�ʰ� ��ð� ��� �������� ����ϱ�
		int num = 12345;
		//Ű���忡�� �Է¹ޱ�
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		System.out.println(num/3600+"�ð�"+(num%3600)/60+"��"+num%60+"��");
	}
}
