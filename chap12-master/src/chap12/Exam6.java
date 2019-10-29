package chap12;

import java.util.Calendar;
import java.util.Scanner;
/*
�⵵�� ���� �Է¹޾� �޷� ����ϱ�
�⵵�� �Է��ϼ���
2019
���� �Է��ϼ���
9
	   2019��9��
   ��   ��   ȭ   ��   ��   ��   ��
  1  2  3  4  5  6  7
  8  9 10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30
 
*/
public class Exam6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ���");
		int year = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year,mon-1,1); //������ ���� 1�� ����
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK); //1���� ����
		int lastday = cal.getActualMaximum(Calendar.DATE); //�ش���� ������ ����.
		System.out.println("\t"+year + "��" + mon + "��");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n","��,��,ȭ,��,��,��,��,��".split(","));
//		int day=1;
//		for(int i=1;i<7;i++) {
//			for(int j=1;j<=7;j++) {
//				if(i==1&&j<firstWeek) System.out.printf("%3s"," ");
//				else System.out.printf("%3d",day++);
//				if(day > lastday) break;
//			}
//			if(day > lastday) break;
//			System.out.println();
//		}

		for(int i=1,day=1;day<=lastday;i++) {
			if(i < firstWeek) System.out.printf("%3s"," ");
			else System.out.printf("%3d",day++);
			if(i%7==0)System.out.println();
		}
		
	}
}
