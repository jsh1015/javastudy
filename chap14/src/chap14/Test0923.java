package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/*
 * 1~1000�������� ��ȣ�� ������ ������ �ִ�.
 * 1�� 1��, 2�� 2��, 3�� 3�� �� ��÷�ϴ� ���α׷� �ۼ��ϱ�
 * �� ��÷�� 3����� ��÷�ϰ�, ��÷��ȣ�� �ߺ��Ǹ� �ȵȴ�.
 * ����� ������ ����ϹǷ� ����� ����� �޶�����.
 * LinkedHashSet : ��������, �ߺ��Ұ�
 * Random
 * new ArrayList(Set) : Set ��ü�� List ��ü�� ����
 */

public class Test0923 {
	public static void main(String[] args) {
		Set<Integer> Lotto = new LinkedHashSet<>();
		
//		while(Lotto.size()<6) {
//			Lotto.add((int)(Math.random()*1000)+1);
//		}
//		List<Integer> a = new ArrayList<Integer>(Lotto);
//		System.out.println("3�� ���� ��÷�մϴ�.");
//		for(int i=0;i<3;i++) {
//			System.out.println(a.get(i));
//		}
//		System.out.println("2�� ���� ��÷�մϴ�.");
//		for(int i=3;i<5;i++) {
//			System.out.println(a.get(i));
//		}
//		System.out.println("1�� ���� ��÷�մϴ�.");
//		System.out.println(a.get(5));
//		System.out.println();
//		
//		System.out.println("***���� ��÷ ���***");
//		System.out.print("1��:");
//		System.out.println(a.get(5));
//		System.out.print("2��:");
//		for(int i=3;i<5;i++) {
//			System.out.print(a.get(i) + ",");
//		}
//		System.out.println();
//		System.out.print("3��:");
//		for(int i=0;i<3;i++) {
//			System.out.print(a.get(i) + ",");
//		}
//		System.out.println();
		
		while(Lotto.size()<6) {
			if(Lotto.size() == 0) {
				System.out.println("3�� ���� ��÷�մϴ�.");
			}else if(Lotto.size()==3) {
				System.out.println("2�� ���� ��÷�մϴ�.");
			}else if(Lotto.size()==5) {
				System.out.println("1�� ���� ��÷�մϴ�.");
			}
			int num = (int)(Math.random()*1000)+1;
			if(Lotto.add(num)) {
				System.out.println(num);
			}
		}
		System.out.println("*** ���� ��÷ ��� ***");
		List<Integer> list = new ArrayList<>(Lotto);
		System.out.println("1�� : " + list.subList(5,6));
		System.out.println("2�� : " + list.subList(3,5));
		System.out.println("3�� : " + list.subList(0,3));
//		for(int i=list.size()-1; i>=0; i--) {
//			if(i == list.size()-1)
//				System.out.println("1�� : " + list.get(i));
//			else if(i >= list.size()-2)
//				System.out.println("2�� : " + list.get(i)+ ",");
//			else if(i < list.size()-2 && i>=3)
//				System.out.println(list.get(i)+ ",");
//			else if(i==2)
//				System.out.print("\n3�� : " + list.get(i)+ ",");
//			else
//				System.out.println(list.get(i) + ",");
//		}
	}
}
