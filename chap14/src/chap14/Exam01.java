package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾Ƽ� ������ ��հ� �߰����� ����ϱ�
 * 
 * 10 40 30 60 30
 * ����
 * 10 30 30 40 60
 * ��հ� : ...
 * �߰��� : 30
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
				System.out.println("Ȧ������ ���ڸ� �Է��ϼ���");
				String num1 = null;
				num1 = scan.nextLine();
				String[] num2 = num1.split(" ");
				if(num2.length%2==0) {
					throw new Exception("Ȧ������ ���ڰ� �ƴմϴ�. �ٽ��Է��ϼ���.");
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
				System.out.println("��հ� : " + sum/cnt);
				System.out.println("�߰��� : " + list.get(list.size()/2));
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
//				System.out.println("���� �Է��� �����ڽ��ϱ�?");
//				String yn = scan.next();
//				if(yn.equalsIgnoreCase("y")) break;
//			}
//		}
//		System.out.println("�Է¼����� ��:" + sum);
//		Collections.sort(list);
//		System.out.println(list);
//		System.out.println("�Է¼����� �߰���:"+ list.get(list.size()/2));
	}
}
