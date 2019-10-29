package chap06;

import java.util.Scanner;

/*
 * 화면에서 5개의 점수를 입력받아서 점수의 합계, 평균, 최대점수, 최소점수 출력하기
 * 입력받는 점수는 score 배열에 저장하기.
 */
public class Exam01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0,max=0,min=0;
		System.out.println("5명의 점수를 입력하세요");
		for(int i=0;i<score.length;i++) {
			score[i] = scan.nextInt();
			sum +=score[i];
			if(max < score[i]) max =score[i]; 
			if(i==0 || min > score[i]) min = score[i];
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length);
		System.out.println("최대점수:" + max);
		System.out.println("최소점수:" + min);
		
	}
}