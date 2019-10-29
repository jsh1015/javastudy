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
		System.out.println(set); //순서를 모르는것이지 순서가 없는것은 아님.
		//개선된 for 구문으로 Collection 객체를 조회할 수 있다.
		//jdk 5.0 추가됨
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
//		System.out.println(it.next()); //error Iterator는 단방향이므로 할 수 없음
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
