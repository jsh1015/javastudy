package chap14;

import java.util.List;
import java.util.Vector;

/*
 * Vector 예제 : Collection 프레임워크 이전에 사용되던 클래스.
 */
public class ListEx2 {
	public static void main(String[] args) {
		List<Double> list = new Vector<Double>();
//		Vector<Double> list = new Vector<Double>();
		list.add(0.3); 
		list.add(Math.PI); 
//		list.addElement(5.0); //Vector의 추가기능 메서드. add와 같은 기능
		list.add(5.0);
//		list.add(1d);
		for(Double o : list) {
			System.out.println(o);
		}
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >= 0) System.out.println(num + "의 위치 : " + index);
		else System.out.println(num + "은 list에 없습니다.");
		num = 0.3;
		System.out.println(list.indexOf(5.0)); 
		if(list.contains(num)) { //list의 요소 중 0.3인 데이터 존재?
//			list.removeElement(num);
			list.remove(num);
			System.out.println(num + "삭제됨.");
		}
		System.out.println(list.indexOf(num)); //-1 <= 0.3이 없기때문에
		System.out.println(list.indexOf(5.0)); //1 자동으로 인덱스가 변함. => 가변배열
		System.out.println(list);
	}
}
