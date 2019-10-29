package chap14;

import java.util.Comparator;
import java.util.TreeSet;
// ex) �Խ��� ����

/*
 * ���� ���� �������̽�
 * Comparable �������̽� : �߻�޼��� compareTo(Object)
 * 						�ش� Ŭ������ �⺻ ���� ����� ����
 * Comparator �������̽� : �߻�޼��� compare(Object o1, Object o2) : ��ü�� �������̵� ���� �ʰ� ���Ĺ���� ���� ����
 * 						�⺻ ���� ����� �����ϰ� ���� ���Ĺ���� ����
 */
class Phone implements Comparable<Phone>{ //���׸�
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
		return name.compareTo(p.name); //�̸������� ����
	}
}
public class SetEx4 {
	public static void main(String[] args) {
		TreeSet<Phone> set = new TreeSet<>(); // Phone��ü��ü�� �̸������� ����̱⶧���� �̸������� ���
		System.out.println("�̸������� ���");
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
		
		System.out.println("��ȭ��ȣ������ ���");
		set = new TreeSet<>(new Comparator<Phone>(){ //Comparator ���ο� ��� ����
			@Override
			public int compare(Phone p1, Phone p2) {
				return p1.number - p2.number;
			}
//			@Override
//			public int compare(Phone p1, Phone p2) {
//				return p1.name.compareTo(p2.name);
//			}
		}); //����
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
		
		System.out.println("�̸��� �������� ���");
		set = new TreeSet<>(Comparator.reverseOrder()); //Comparator ���ο� ��� ����
		//class�� �̸������� ���ĵǾ������ϱ� reverseOrder�� �ϸ� �̸��� �������� ������.
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);
		
		System.out.println("��ȭ��ȣ�� �������� ���");
//		TreeSet<Phone> set = new TreeSet<Phone>(new NumberDesc());
		set = new TreeSet<>(new Comparator<Phone>(){ //Comparator ���ο� ��� ����
			@Override
			public int compare(Phone p1, Phone p2) { 
				return p2.number - p1.number;
			}
		});
		set.add(new Phone("ȫ�浿",1234));
		set.add(new Phone("���",3456));
		set.add(new Phone("�̸���",5678));
		System.out.println(set);

	}
}
