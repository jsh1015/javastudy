package test;
class Card {
	String kind;
	int num;
	Card(String kind,int num) {
		this.kind = kind;
		this.num = num;
	}
	Card() {
		this("Spade",1);
	}
	// equals : Object 클래스 멤버. 모든클래스의 객체에서 접근 가능.
	//          내용을 비교할때 사용. 각각의 클래스에서 오버라이딩 필요.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Card) {
			Card c = (Card)obj;
			return kind.equals(c.kind) && num == c.num;
		} else return false;
	}
	//toString : Object 클래스의 멤버.
	//           객체의 문자열 표시를 위한 메서드.
	//           참조변수이름을 문자열로 표시할때 자동 호출되는 메서드
	//  Object 클래스 
	//         클래스명@16진수해쉬코드값
	public String toString() {
		return "("+kind + "," + num + ")";
	}
}
public class Test0918_1 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade",1);
		Card c2 = new Card();
		if(c1==c2) {
			System.out.println("c1과 c2는 같은 객체입니다.");
		} else {
			System.out.println("c1과 c2는 다른 객체입니다.");
		}
		if(c1.equals(c2)) {
			System.out.println("c1과 c2는 같은 내용의 카드 입니다.");
		} else {
			System.out.println("c1과 c2는 다른 내용의 카드 입니다.");
		}
		System.out.println("c1 카드 :" + c1);
		System.out.println("c2 카드 :" + c2);
	}
}
