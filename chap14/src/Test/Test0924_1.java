package Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/*
 * Student 클래스 구현하기
 * 멤버변수 : 이름, 국어점수, 영어점수, 수학점수
 * 멤버메서드 : 
 * 		String toString() : 각 멤버변수 값, 총점, 평균 출력
 * 		int getTotal() : 점수의 합 리턴
 * 		int compareTo() : 이름 오름차순으로 정렬되도록 구현
 */
class Student implements Comparable<Student>{
	String name;
	int kor, eng, math;
	int sum = 0;
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal() {
		return kor+eng+math;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	public String toString() {
		return name + ":" + "국어 = " + kor + ", " + "영어 = " + eng + ", " + 
				"수학 = " + math + ", 총점 : " + getTotal() + ", 평균 : " + getTotal()/3 + "\n";
	}
	
}
public class Test0924_1 {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",90,80,70));
		list.add(new Student("김삿갓",95,85,75));
		list.add(new Student("이몽룡",80,95,95));
		list.add(new Student("임꺽정",60,75,100));
	
		System.out.println("기본정렬방식");
		TreeSet<Student> set1 = makeTreeSet(list,null); //이름 오름차순
		System.out.println(set1);
		System.out.println("총점기준 내림차순 정렬");
		TreeSet<Student> set2 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getTotal() - o1.getTotal();
			}
		});
		
		System.out.println(set2);
		System.out.println("국어 점수내림차순 정렬");
		TreeSet<Student> set3 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.kor - o1.kor;
			}
		});
		
		System.out.println(set3);
		System.out.println("영어 점수내림차순 정렬");
		TreeSet<Student> set4 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.eng - o1.eng;
			}
		});
		
		System.out.println(set4);
		System.out.println("수학 점수내림차순 정렬");
		TreeSet<Student> set5 = makeTreeSet(list,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.math - o1.math;
			}
		});
		System.out.println(set5);
	}
	private static TreeSet<Student> makeTreeSet(List<Student> list, Comparator<Student> c) {
		TreeSet<Student> set = new TreeSet<Student>(c);
		set.addAll(list);
		return set;
	}
}

