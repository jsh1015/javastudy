package chap14;

import java.util.*;

/*
 * 1. 대한민국(서울), 캐나다(오타와), 영국(런던), 스위스(베른)을 HashMap에 저장하고
 *	    화면에서 나라이름을 입력받아, 해당나라의 수도를 출력하는 프로그램 작성하기
 * 2. 등록된 나라가 아닌 경우 "등록된 수도가 없습니다. 등록하시겠습니까?(등록:y)"
 * 		=> y,Y인경우 수도를 등록하기
 * 3. 프로그램 종료전 현재 등록된 나라와 수도 목록을 출력하기 
 */
public class Exam04 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		String[] a = {"대한민국","캐나다","영국","스위스"};
		String[] b = {"서울","오타와","런던","베른"};
		for(int i=0;i<a.length;i++) {
			m.put(a[i], b[i]);
		}
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("나라를 입력하세요(대한민국|캐나다|영국|스위스|종료:끝)");
			String c = scan.next();
			if(c.equals("끝")) {
				break;
			}
			if(m.get(c)==null) {
				System.out.println(" * 등록된 수도가 없습니다. 등록하시겠습니까? (등록:y)");
				String yn = scan.next();
				if(yn.equalsIgnoreCase("y")) {
					System.out.println(" - 나라를 입력하세요");
					String a1 = scan.next();
					System.out.println(" - 수도를 입력하세요");
					String b1 = scan.next();
					m.put(a1, b1);
					System.out.println("*등록이 완료되었습니다*");
				}
			}
			System.out.println(c + "의 수도 : " + m.get(c));
		}
		Set<Map.Entry<String, String>> entry = m.entrySet();
		for(Map.Entry<String, String> r : entry) {
			System.out.println(r.getKey() + "의 수도 : " + r.getValue());
		}
//		for(Object k : m.entrySet()) {
//			System.out.println(k);
//		}
		System.out.println("프로그램 종료");
	}
}
