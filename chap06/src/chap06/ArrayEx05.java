package chap06;

import java.util.Scanner;

/*
 * 10진수를 입력받아 2,8,10,16 진수로 변경하기
 */
public class ArrayEx05 {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16};
		char[] data = {'0','1','2','3','4','5','6','7','8','9',
				'A','B','C','D','E','F'};
		char arr[] = new char[32];
		Scanner scan = new Scanner(System.in);
		System.out.println("변환할 10진수를 입력하세요");
		int num = scan.nextInt();
		int divnum = num, index = 0;
		for(int d : digit) {
			divnum = num;
			index = 0;
			while(divnum != 0) {
				arr[index++] = data[divnum%d];
				divnum /= d;
			}
			System.out.print(num + "의" + d +"진수");
			for(int i=index-1; i>=0; i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println("2진수 : "+ Integer.toBinaryString(num));
		System.out.println("8진수 : "+ Integer.toOctalString(num));
		System.out.println("16진수 : "+ Integer.toHexString(num));
	}

}
