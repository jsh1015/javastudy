package chap14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"홍길동","김삿갓","이몽룡","임꺽정","김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		//Value = map.get(Key) => Key에 해당하는 Value값을 리턴
		System.out.println("홍길동의 번호 : " + map.get("홍길동"));
		System.out.println("이몽룡의 번호 : " + map.get("이몽룡"));
		System.out.println("김삿갓의 번호 : " + map.get("김삿갓"));
		System.out.println();
		
		//Key값들만 조회
		System.out.println("Key값들만 조회하기");
		Set<String> keys = map.keySet(); //Key는 절대 중복되지 않기 때문에 Set으로 객체생성
		for(String k : keys) {
			System.out.println(k + "의 번호 : " + map.get(k));
		}System.out.println();
		
		//Value값만 조회
		System.out.println("Value값만 조회");
		Collection<Integer> values = map.values(); //Value는 중복도되고 순서도 모름 => Key값 조회 불가.
		for(Integer v : values) {
			System.out.println(v);
		}System.out.println();
		
		//Key와 Value가 쌍으로 있는 객체 : Map.Entry
		System.out.println("Key,Value의 쌍인 객체로 조회");
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) { //entry에있는 Map.Entry각자가 출력
			System.out.println(m.getKey() + "의 번호 : " + m.getValue());
			System.out.println(m);
		}System.out.println();
	}
}
