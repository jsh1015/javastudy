package chap14;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 예제
 * 		Set > SortedSet 구현클래스
 * 		Set : 중복불가
 * 		SortedSet : 정렬됨
 * 
 * 		=> 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만 TreeSet에 요소로 저장가능
 * 
 * 정렬 관련 인터페이스
 * 		- Comparator : 기본 정렬 방식을 변경할때 사용
 * 		- Comparable : 기본 정렬 방식 지정할때 사용
 */
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
//		set = new TreeSet<>(new Descending()); //이전버전
		set = new TreeSet<>(Comparator.reverseOrder()); //8.0버전 Comparator에있는 static 메서드 reverseOrder 사용
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");
		set.add("bat");set.add("azz");
		set.add("car");set.add("Car");
		set.add("disc");set.add("dance");
		set.add("dZZZZ");set.add("dzzzz");
		set.add("elevator");set.add("fan");
		set.add("flower");
		System.out.println(set);
//		System.out.println("from:"+from + ",to:" + to);
//		System.out.println(set.subSet(from,to)); //정렬되어야 subSet 사용가능 //뒤에있는 값을 포함하지 않은 값.
//		System.out.println("from:"+from + ",to:" + to + "zzzz");
//		System.out.println(set.subSet(from, to+"zzzz"));
//		//대문자는 소문자보다 앞순서.
	}
}

//class Descending implements Comparator{
//	@Override
//	public int compare(Object o1, Object o2) {
//		Comparable c1 = (Comparable)o1;
//		Comparable c2 = (Comparable)o2;
//		return c1.compareTo(c2)*-1;
//	}
//}
