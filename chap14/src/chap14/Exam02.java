package chap14;

import java.util.HashSet;
import java.util.Set;
/*
 * Student 클래스 구현하기
 * 1. 멤버변수:학번(studno), 이름(name), 전공(major)
 * 2. 멤버메서드:toString() 오버라이딩
 * 3. 학번과 이름이 같으면 같은 학생으로 인식하도록 오버라이딩하기
 * 4. 구동 클래스에 맞도록 생성자 구현하기
 */
class Student{
	String studno;
	String name;
	String major;
	Student(String studno, String name, String major){
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	
	public int hashCode() {
		return studno.hashCode() + name.hashCode(); //학번과 이름이 같은경우
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return studno.equals(s.studno) && name.equals(s.name); 
		}else {
			return false;
		}
	}
	
	public String toString() {
		return "(" + studno + "," + name + "," + major + ")";
	}
}
public class Exam02 {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공")); //추가 불가
		set.add(new Student("1234","홍길동","통계"));
		set.add(new Student("4567","홍길동","경영"));
		System.out.println("등록 학생 수 : " + set.size());
		System.out.println(set);
	}
}
