package chap06;

import java.util.Scanner;

/*
 * 10������ �Է¹޾� 2,8,10,16 ������ �����ϱ�
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16};
		char[] data = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		char arr[] = new char[32];
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȯ�� 10������ �Է��ϼ���");
		int num = scan.nextInt();
		int divnum = num, index = 0;
		for(int d : digit) {
			divnum = num;
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];
				divnum /= d;
			}
			System.out.print(num + "��" + d +"����");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println("2���� : "+ Integer.toBinaryString(num));
		System.out.println("8���� : "+ Integer.toOctalString(num));
		System.out.println("16���� : "+ Integer.toHexString(num));
	}

}
