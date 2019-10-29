package chap10;
/*
 * 내부 클래스 예제
 * *클래스와 멤버간의 관계*
 * 
 * 		- 인스턴스 내부 클래스 : 클래스 멤버를 가질 수 없다. 단 상수는 가능
 * 		- static 내부 클래스 : 클래스 멤버를 가질 수 있다.
 * 		- 지역 내부 클래스 : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
 * 						클래스 멤버를 가질 수 없다. 단 상수는 가능
 * 		- *** 무명 내부 클래스 *** : 클래스 없이 객체화 가능한 클래스
 * 								추상클래스(상속을 통해 객체화), 인터페이스(구현을 통해 객체화) 의 객체화가 가능함.
 * 
 * 내부클래스의 특징
 * 		1. 클래스 내부에 존재하는 클래스
 * 		2. 자료형으로 사용됨. 객체화 가능. Object 클래스의 하위 클래스.
 * 		      멤버(변수, 메서드, 생성자)를 소유 할 수 있다. 
 * 		3. * 외부 클래스의 멤버 = 외부 클래스의 private 멤버에 접근가능.
 */
class Outer1{
	class InstanceInner{	//인스턴스 내부클래스
		int iv = 100;
//		static int cv=10; //클래스 멤버를 가질 수 없다.
		final static int MAX = 200; //클래스 멤버지만 상수는 가질 수 있다.
	}
	
	static class StaticInner{ //static 내부클래스
		int iv = 300;
		static int cv = 400;	//클래스 멤버를 가질 수 있다.
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner{	//지역 내부 클래스 : 메서드 내부에서만 사용할 수 있다.
			// 생성자 생성 가능. 상속 가능. 클래스랑 같음 멤버적인 요소만 갖고있을뿐
			int iv = 600;
//			static int cv = 700; //클래스 멤버를 가질 수 없다.
			final static int MAX = 700; //상수는 가능
		}
		LocalInner lc = new LocalInner();	//메서드 내부에서 객체 생성
		System.out.println(lc.iv); // 600
		System.out.println(lc.MAX); // 700
		System.out.println(LocalInner.MAX); // 700
	}
	
	void method2() {
//		LoccalInner lc = new LocalInner();  => method() 내부에서만 사용가능
	}
}
public class InnerEx01 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner(); //자료형 외부클래스.내부클래스
		System.out.println(si.iv); // 300
		System.out.println(Outer1.StaticInner.cv); // 400
		System.out.println(Outer1.StaticInner.MAX); // 500
		
		Outer1.InstanceInner ii = new Outer1().new InstanceInner(); //외부클래스 객체화가 되어야하는 인스턴스멤버
		//위아래 같은 의미
		Outer1 outer = new Outer1(); 
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		
		System.out.println(ii2.iv); // 100
		System.out.println(Outer1.InstanceInner.MAX); // 200 **상수**이기때문에 이렇게 접근 가능
		outer.method(); // 600, 700, 700
	}

}
