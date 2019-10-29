package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//<Integer> : ���׸�ǥ��
		//List<Integer> : Integer ��ü�� ������ ������ �� �ִ� ��ü�� ������ �������� ����.
		//ArrayList : �����迭. ������ ������ ���� ��ü�� ����.
		//			    ÷�� ��� ����. []�� �ƴ�. ��� get�̶�°� ���
		list.add(1); list.add(2); list.add(5);
		list.add(4); list.add(3); list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
		//list.subList(1, 4) : list��ü�� 1���ε������� 3���ε������� �κи���Ʈ�� ����
		//1�� list���� 4�� list������ ��ü�� ����
		System.out.println(list2);
		Collections.sort(list2); //list2��ü�� ����
		//List�� �޾ƿ� ������ �����ϹǷ� ����.
		//Collections�� 'Collection �����ӿ�ũ'�� ��ü���� �پ��� ����� ����ϱ� ���� Ŭ�����̴�. 
		//Collections : Collection �����ӿ�ũ�� ���õ� �߰������ ����� ���� Ŭ����.
		System.out.println(list2);
	}
}
