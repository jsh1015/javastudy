package chap07;
/*
 * 추상화 : 클래스 생성 과정.
 * 클래스 : 사용자 정의 자료형.
 * 		속성 : 멤버변수
 * 		기능 : 멤버메서드
 */
class Phone{
	String color;
	boolean power;
	String no;
	void power() {power = !power;}
	void send(String no) {
		System.out.println(no + "로 전화 송신 중~~");
	}
	void receive(String no) {
		System.out.println(no + "로 전화 수신 중~~");
	}
}

public class PhoneEx01 {
	public static void main(String[] args) {
		//Phone p1 => 참조변수 선언
		//new Phone() => 객체 생성. 객체화, 인스턴스화
		//new 예약어 : 객체 생성기능. 메모리 할당
		//			 String을 제외한 모든 클래스의 객체 생성은 new 연산자로 가능함
		Phone p1 = new Phone(); // 참조변수 = 객체 생성
		p1.color ="검정";
		p1.power = true;
		p1.no = "01012341234";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01043214321");
		p1.receive("01043214321");
		Phone p2 = new Phone();
		/*
		 * new 예약어 가능
		 * 1. 힙영역에 메모리 할당.
		 * 2. 멤버변수를 기본값으로 초기화
		 * 	   기본값 : 숫자 : 0
		 * 			boolean : false
		 * 			그외 : null
		 * 3. 생성자 호출 기능
		 */
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2 = p1;
		/*
		 * p1 객체와 p2객체는 같은 객체임.
		 * 하나의 객체는 두개의 참조변수가 참조가 가능함.
		 * 하나의 참조변수가 두개의 객체는 참조 불가능함.
		 */
		p1.power();
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}

}
