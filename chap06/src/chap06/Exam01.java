package chap06;

import java.util.Scanner;

/*
 * ȭ�鿡�� 5���� ������ �Է¹޾Ƽ� ������ �հ�, ���, �ִ�����, �ּ����� ����ϱ�
 * �Է¹޴� ������ score �迭�� �����ϱ�.
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0,max=0,min=0;
		System.out.println("5���� ������ �Է��ϼ���");
		for(int i=0;i<score.length;i++) {
			score[i] = scan.nextInt();
			sum +=score[i];
			if(max < score[i]) max =score[i]; 
			if(i==0 || min > score[i]) min = score[i];
		}
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + (double)sum/score.length);
		System.out.println("�ִ�����:" + max);
		System.out.println("�ּ�����:" + min);
		
	}
}