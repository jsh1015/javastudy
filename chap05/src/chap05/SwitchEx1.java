package chap05;

import java.util.Scanner;

/*
 * switch ��������
 * ������ �Է¹޾� A ~ F���� ����ϱ�
 * 
 * switch(���ǰ�(����,����)){
 * 		case ��1 : ����1 ; break;
 * 		case ��2 : ����2 ; break;
 * 		...
 * 		default : ����;
 * }
 * 
 * break ���� : break�� ���� switch ����, �ݺ����� ����.
 */
public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		String grade;
		switch(score/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade = "F"; break;
		}
		System.out.println(grade + "����");
	}

}
