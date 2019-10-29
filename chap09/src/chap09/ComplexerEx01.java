package chap09;
/*
 * 인터페이스
 * 1. 인터페이스의 멤버는 상수, 추상메서드, default메서드 , static메서드만 가능
 * 	  public static final 자료형 상수
 * 	  public abstract 자료형 메서드명();
 * 	  public default 자료형 메서드명() {} => jdk8.0 이후에서만 가능
 * 	  public static 자료형 메서드명(); {} => jdk8.0 이후에서만 가능
 * 2. 인터페이스 멤버의 접근 제어자는 public
 * 3. 객체화 불가. => 구현클래스로 객체화가 된다.
 * 4. 클래스와 인터페이스 간은 구현으로 표현하다.
 * 		=> 다중 구현이 가능함.
 * 5. 인터페이스간의 상속은 다중상속이 가능하다.
 */
interface Printerable{
	// public static final 제어자 생략
	int INK = 100;
	// public abstract 제어자 생략
	void print();
}
interface Scannerable{
	void scan();
}
interface Faxable{
	String FAX_NO = "010-12345";
	void send(String tel);
	void receive(String tel);
}
//인터페이스 간의 상속은 다중 상속이 가능함.
interface Complexerable extends Printerable, Scannerable, Faxable{}; //다중 상속이 가능.
//클래스와 인터페이스는 구현관계임.
//클래스와 인터페이스는 다중 구현이 가능함.
//인터페이스를 구현한 클래스를 구현클래스라 한다.
//구현 클래스
class Complexer implements Complexerable{
	int ink;
	Complexer(){
		this.ink = INK; // 나의 잉크에 Printerable에있는 INK를 넣음.
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량:" + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서   " + tel + "번호로 FAX를 전송");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서  " + FAX_NO + "로 FAX를 수신");
	}
}
public class ComplexerEx01 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본 잉크량 : " + Printerable.INK);
		System.out.println("FAX 번호 : " + Complexerable.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678");
		com.send("02-5678");
		if(com instanceof Complexer) {
			System.out.println("com 참조변수의 객체는 Complexer 객체임");
		}
		if(com instanceof Complexerable) {
			System.out.println("com 참조변수의 객체는 Complexerable 객체임");
			Complexerable ca = com; // 형변환 연산자 생략가능
			ca.print();
			ca.scan();
			ca.receive("02-1234");
			ca.send("02-1234");
		}
		if(com instanceof Printerable) {
			Printerable pa = com;
			pa.print();
			System.out.println(pa.INK);
//			pa.scan();
		}
		if(com instanceof Scannerable) {
			Scannerable sa = com;
			sa.scan();
		}
		if(com instanceof Faxable) {
			Faxable fa = com;
			System.out.println(fa.FAX_NO);
			fa.send("02-3456");
			fa.receive("02-3456");
		}
	}
}
