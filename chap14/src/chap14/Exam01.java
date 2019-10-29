package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

/*
 * 화면에서 홀수개의 숫자를 입력받아서 숫자의 평균과 중간값을 출력하기
 * 
 * 10 40 30 60 30
 * 정렬
 * 10 30 30 40 60
 * 평균값 : ...
 * 중간값 : 30
 * 
 */
public class Exam01 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				Integer n =0;
				int sum = 0, cnt =0;
				List<Integer> list = new ArrayList<Integer>();
				System.out.println("홀수개의 숫자를 입력하세요");
				String num1 = null;
				num1 = scan.nextLine();
				String[] num2 = num1.split(" ");
				if(num2.length%2==0) {
					throw new Exception("홀수개의 숫자가 아닙니다. 다시입력하세요.");
				}
				for(int i=0; i<num2.length; i++) {
					n = Integer.parseInt(num2[i]);
					sum += n;
					cnt++;
					list.add(n);
				}
				System.out.println(list);
				Collections.sort(list);
				System.out.println(list);
				System.out.println("평균값 : " + sum/cnt);
				System.out.println("중간값 : " + list.get(list.size()/2));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
//		int sum = 0;
//		while(true) {
//			int input = scan.nextInt();
//			list.add(input);
//			sum += input;
//			if(list.size()%2==1) {
//				System.out.println("숫자 입력을 끝내겠습니까?");
//				String yn = scan.next();
//				if(yn.equalsIgnoreCase("y")) break;
//			}
//		}
//		System.out.println("입력숫자의 합:" + sum);
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println("입력숫자의 중간값:"+ list.get(list.size()/2));
	}
}
