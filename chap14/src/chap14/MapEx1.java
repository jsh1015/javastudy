package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//Value = map.get(Key) => Key�� �ش��ϴ� Value���� ����
		System.out.println("ȫ�浿�� ��ȣ : " + map.get("ȫ�浿"));
		System.out.println("�̸����� ��ȣ : " + map.get("�̸���"));
		System.out.println("����� ��ȣ : " + map.get("���"));
		System.out.println();
		
		//Key���鸸 ��ȸ
		System.out.println("Key���鸸 ��ȸ�ϱ�");
		Set<String> keys = map.keySet(); //Key�� ���� �ߺ����� �ʱ� ������ Set���� ��ü����
		for(String k : keys) {
			System.out.println(k + "�� ��ȣ : " + map.get(k));
		}System.out.println();
		
		//Value���� ��ȸ
		System.out.println("Value���� ��ȸ");
		Collection<Integer> values = map.values(); //Value�� �ߺ����ǰ� ������ �� => Key�� ��ȸ �Ұ�.
		for(Integer v : values) {
			System.out.println(v);
		}System.out.println();
		
		//Key�� Value�� ������ �ִ� ��ü : Map.Entry
		System.out.println("Key,Value�� ���� ��ü�� ��ȸ");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) { //entry���ִ� Map.Entry���ڰ� ���
			System.out.println(m.getKey() + "�� ��ȣ : " + m.getValue());
			System.out.println(m);
		}System.out.println();
	}
}
