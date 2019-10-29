package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//<Integer> : 제네릭표현
		//List<Integer> : Integer 객체를 여러개 저장할 수 있는 객체를 참조할 참조변수 선언.
		//ArrayList : 가변배열. 저장할 갯수를 몰라도 객체를 저장.
		//			    첨자 사용 가능. []는 아님. 대신 get이라는것 사용
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(3); list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		//list.subList(1, 4) : list객체의 1번인덱스부터 3번인덱스까지 부분리스트로 리턴
		//1번 list에서 4번 list전까지 객체를 만듬
		System.out.println(list2);
		Collections.sort(list2); //list2객체를 정렬
		//List는 받아온 순서를 유지하므로 정렬.
		//Collections는 'Collection 프레임워크'의 객체들의 다양한 기능을 사용하기 위한 클래스이다. 
		//Collections : Collection 프레임워크에 관련된 추가기능을 멤버로 가진 클래스.
		System.out.println(list2);
	}
}
