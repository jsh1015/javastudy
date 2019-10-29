package chap14;

import java.util.Comparator;
import java.util.TreeSet;
// ex) 게시판 정렬

/*
 * 정렬 관련 인터페이스
 * Comparable 인터페이스 : 추상메서드 compareTo(Object)
 * 						해당 클래스의 기본 정렬 방식을 지정
 * Comparator 인터페이스 : 추상메서드 compare(Object o1, Object o2) : 객체에 오버라이딩 하지 않고 정렬방식을 따로 지정
 * 						기본 정렬 방식을 무시하고 따로 정렬방식을 지정
 */
class Phone implements Comparable<Phone>{ //제네릭
	String name;
	int number;
	public Phone(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String toString() {
		return "(" + name + "," + number + ")";
	}
	@Override
	public int compareTo(Phone p) {
		return name.compareTo(p.name); //이름순으로 정렬
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<Phone> set = new TreeSet<>(); // Phone객체자체가 이름순으로 출력이기때문에 이름순으로 출력
		System.out.println("이름순은로 출력");
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("전화번호순으로 출력");
		set = new TreeSet<>(new Comparator<Phone>(){ //Comparator 새로운 방식 지정
			@Override
			public int compare(Phone p1, Phone p2) {
				return p1.number - p2.number;
			}
//			@Override
//			public int compare(Phone p1, Phone p2) {
//				return p1.name.compareTo(p2.name);
//			}
		}); //정렬
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("이름의 역순으로 출력");
		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator 새로운 방식 지정
		//class는 이름순으로 정렬되어있으니깐 reverseOrder를 하면 이름의 역순으로 지정됨.
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);
		
		System.out.println("전화번호의 역순으로 출력");
//		TreeSet<Phone> set = new TreeSet<Phone>(new NumberDesc());
		set = new TreeSet<>(new Comparator<Phone>(){ //Comparator 새로운 방식 지정
			@Override
			public int compare(Phone p1, Phone p2) { 
				return p2.number - p1.number;
			}
		});
		set.add(new Phone("홍길동",1234));
		set.add(new Phone("김삿갓",3456));
		set.add(new Phone("이몽룡",5678));
		System.out.println(set);

	}
}
