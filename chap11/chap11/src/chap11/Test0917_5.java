package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 1. ������ �� ����
 * 2. �ݺ������� ������ �Է¹ޱ�.
 * 		����� ��
 * 3. �Է� Ƚ�� ����
 */

public class Test0917_5 {
	public static void main(String[] args) throws Exception {
		int num = (int)(Math.random()*100)+1;
		System.out.println(num);
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		while(true) {
			System.out.print(" * ���ڸ� �Է��ϼ��� : ");
			try{
				int a = scan.nextInt();
				cnt++;
				if(a<1 || a>100) {
					throw new Exception("\t(����) 1�� 100������ ���ڸ� �Է��ϼ���");
				}else if(a > num) {
					System.out.println("\t"+ a + " ���� ������ �Դϴ�.");
				}else if(a < num) {
					System.out.println("\t"+ a + " ���� ū �� �Դϴ�.");
				}
				if(a == num) {
					System.out.println(cnt + "���Է�. �����Դϴ�.");
					break;
				}
			}catch(InputMismatchException e1) {
				cnt++;
				System.out.println("\t(����) ���ڸ� �Է��ϼ���");
				String str = scan.next();
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}
}
