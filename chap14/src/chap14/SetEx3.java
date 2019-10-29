package chap14;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet ����
 * 		Set > SortedSet ����Ŭ����
 * 		Set : �ߺ��Ұ�
 * 		SortedSet : ���ĵ�
 * 
 * 		=> ��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������ TreeSet�� ��ҷ� ���尡��
 * 
 * ���� ���� �������̽�
 * 		- Comparator : �⺻ ���� ����� �����Ҷ� ���
 * 		- Comparable : �⺻ ���� ��� �����Ҷ� ���
 */
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
//		set = new TreeSet<>(new Descending()); //��������
		set = new TreeSet<>(Comparator.reverseOrder()); //8.0���� Comparator���ִ� static �޼��� reverseOrder ���
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
//		System.out.println(set.subSet(from,to)); //���ĵǾ�� subSet ��밡�� //�ڿ��ִ� ���� �������� ���� ��.
//		System.out.println("from:"+from + ",to:" + to + "zzzz");
//		System.out.println(set.subSet(from, to+"zzzz"));
//		//�빮�ڴ� �ҹ��ں��� �ռ���.
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
