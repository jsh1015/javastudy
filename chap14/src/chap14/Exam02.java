package chap14;

import java.util.HashSet;
import java.util.Set;
/*
 * Student Ŭ���� �����ϱ�
 * 1. �������:�й�(studno), �̸�(name), ����(major)
 * 2. ����޼���:toString() �������̵�
 * 3. �й��� �̸��� ������ ���� �л����� �ν��ϵ��� �������̵��ϱ�
 * 4. ���� Ŭ������ �µ��� ������ �����ϱ�
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
		return studno.hashCode() + name.hashCode(); //�й��� �̸��� �������
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
		set.add(new Student("1234","ȫ�浿","�濵"));
		set.add(new Student("2345","ȫ���","�濵"));
		set.add(new Student("2345","ȫ���","�İ�")); //�߰� �Ұ�
		set.add(new Student("1234","ȫ�浿","���"));
		set.add(new Student("4567","ȫ�浿","�濵"));
		System.out.println("��� �л� �� : " + set.size());
		System.out.println(set);
	}
}
