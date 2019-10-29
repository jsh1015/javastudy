package chap14;

//import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator<Integer> it = null;
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=1;i<=5;i++) {
			list.add(i*10);
			set.add(i*10);
		}
		System.out.println(list);
		System.out.println(set); //������ �𸣴°����� ������ ���°��� �ƴ�.
		//������ for �������� Collection ��ü�� ��ȸ�� �� �ִ�.
		//jdk 5.0 �߰���
		for(Integer o : list) {
			System.out.print(o+ ",");
		}
		System.out.println();
		for(Integer o : set) {
			System.out.print(o+ ",");
		}
		System.out.println();

		it = list.iterator(); 
		print(it);
//		System.out.println(it.next()); //error Iterator�� �ܹ����̹Ƿ� �� �� ����
		it = set.iterator();
		print(it);
		System.out.println(list);
		System.out.println(set);
	}
	private static void print(Iterator<Integer> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
	}
}
