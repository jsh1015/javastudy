package chap05;

import java.util.Scanner;

public class ����02 {

	public static void main(String[] args) {
		// 1. ������ 2x+4y=10�� ��� �ظ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		//	    �� x�� y�� �����̰�, ������ ������ 0<=x<=10, 0<=y<=10
		int x, y;
		for(x=0; x<=10; x++) {
			for(y=0; y<10; y++)
				if(x*2 + y*4 == 10) {
					System.out.println("x="+ x +","+ "y=" + y);
				}
		}
		// 2. �ΰ��� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ����
		//	    ����ϴ� ���α׷� �ۼ�
		int i, j;
		for(i=1;i<=6;i++) {
			for(j=1; j<=6; j++) {
				if(i+j ==6) {
					System.out.println(i+","+j);
				}
			}
		}
		
		// 3. ������, ���Ƹ��� �հ� �ٸ����� ���� �޾Ƽ� �������� ��������
		// 	    ���Ƹ��� �������� ����ϱ�. ����� �ȵ� ��� ���� ���� ����ϱ�
		int x1 = 0; 
		int y1 = 0;
		int X = 0;
		System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		System.out.println("�������� ���Ƹ��� �ٸ� �հ踦 �Է��ϼ���");
		Scanner b = new Scanner(System.in);
		int num2 = b.nextInt();
		
		for(x1=0;x1<=num;x1++) {
			for(y1=0;y1<=num;y1++) {
				if(x1 + y1 == num && x1*4 + y1*2 == num2) {
						System.out.println("��������"+x1+"�����̰�, " +"���Ƹ���"+y1+"�����Դϴ�.");
						X++;
				}
			}
		}
		if(X==0) {
			System.out.println("�������");
		}
	}
}
