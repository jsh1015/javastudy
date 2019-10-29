package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/*
 * 1~1000번까지의 번호를 가지는 복권이 있다.
 * 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
 * 단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
 * 결과는 난수를 사용하므로 실행시 결과가 달라진다.
 * LinkedHashSet : 순서유지, 중복불가
 * Random
 * new ArrayList(Set) : Set 객체를 List 객체로 생성
 */

public class Test0923 {
	public static void main(String[] args) {
		Set<Integer> Lotto = new LinkedHashSet<>();
		
//		while(Lotto.size()<6) {
//			Lotto.add((int)(Math.random()*1000)+1);
//		}
//		List<Integer> a = new ArrayList<Integer>(Lotto);
//		System.out.println("3등 복권 추첨합니다.");
//		for(int i=0;i<3;i++) {
//			System.out.println(a.get(i));
//		}
//		System.out.println("2등 복권 추첨합니다.");
//		for(int i=3;i<5;i++) {
//			System.out.println(a.get(i));
//		}
//		System.out.println("1등 복권 추첨합니다.");
//		System.out.println(a.get(5));
//		System.out.println();
//		
//		System.out.println("***복권 추첨 결과***");
//		System.out.print("1등:");
//		System.out.println(a.get(5));
//		System.out.print("2등:");
//		for(int i=3;i<5;i++) {
//			System.out.print(a.get(i) + ",");
//		}
//		System.out.println();
//		System.out.print("3등:");
//		for(int i=0;i<3;i++) {
//			System.out.print(a.get(i) + ",");
//		}
//		System.out.println();
		
		while(Lotto.size()<6) {
			if(Lotto.size() == 0) {
				System.out.println("3등 복권 추첨합니다.");
			}else if(Lotto.size()==3) {
				System.out.println("2등 복권 추첨합니다.");
			}else if(Lotto.size()==5) {
				System.out.println("1등 복권 추첨합니다.");
			}
			int num = (int)(Math.random()*1000)+1;
			if(Lotto.add(num)) {
				System.out.println(num);
			}
		}
		System.out.println("*** 복권 추첨 결과 ***");
		List<Integer> list = new ArrayList<>(Lotto);
		System.out.println("1등 : " + list.subList(5,6));
		System.out.println("2등 : " + list.subList(3,5));
		System.out.println("3등 : " + list.subList(0,3));
//		for(int i=list.size()-1; i>=0; i--) {
//			if(i == list.size()-1)
//				System.out.println("1등 : " + list.get(i));
//			else if(i >= list.size()-2)
//				System.out.println("2등 : " + list.get(i)+ ",");
//			else if(i < list.size()-2 && i>=3)
//				System.out.println(list.get(i)+ ",");
//			else if(i==2)
//				System.out.print("\n3등 : " + list.get(i)+ ",");
//			else
//				System.out.println(list.get(i) + ",");
//		}
	}
}
