package chap06;

import java.util.Scanner;

public class ����03_0 {

	public static void main(String[] args) {
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int sum =0;
		for(int i=len; i>=1;i--) {
			sum+=i;
		}
		for(int i=1; i<=len; i++) {
			for(int j=1; j<=len; j++) {
				if(j<i)
					System.out.print("\t");
				else
					System.out.print(sum-- + "\t");
			}
			System.out.println();
		}
	}

}
