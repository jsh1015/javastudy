package chap05;

import java.util.Scanner;
/*
 * ���ǹ� if�� �̿��Ͽ�
 * ���ڸ� �Է¹޾Ƽ� ����� ��� ���, �����ΰ�� ����, 0�ΰ�� 0 ����ϱ�
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a>0) {
			System.out.println("���");
		}else if(a<0) {
			System.out.println("����");
		}else {
			System.out.println(0);
		}
	}
}