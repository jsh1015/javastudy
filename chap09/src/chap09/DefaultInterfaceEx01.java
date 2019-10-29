package chap09;
/*
 * jdk 8.0 이후에 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다
 * 
 * 		default 메서드 : 인스턴스 멤버
 * 					      다중 구현이 가능하므로 똑같은 default 메서드가 존재할 수 있다.
 * 					     => 구현클래스에서 오버라이딩이 필요함.
 * 		static 메서드  : 클래스 멤버
 */
interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1()"); //c.method1()
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()"); //c.method1()
	}
}
interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface1의 default 메서드 : method1()"); //c.method1()
	}
	static void staticMethod() {
		System.out.println("MyInterface1의 static 메서드 : staticMethod()"); //c.method1()
	}
}

class Parent{
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method2()");
	}
}
class Child extends Parent implements MyInterface1,MyInterface2 { //메서드명이 같기때문에 : 오버라이딩해야함
	/*
	 * MyInterface1,MyInterface2 인터페이스의 method1 default 메서드가 충돌발생
	 * => Child 클래스에서 반드시 오버라이딩 해야함.
	 */
	@Override
	public void method1() {
		MyInterface1.super.method1(); //MyInterface1의 method1을 가져오라고 선택
	}

@Override
public void method() {
	System.out.println("Child 클래스의 method()");
	System.out.println("MyInterface1, MyInterface2 인터페이스의 추상메서드 method 오버라이딩함");
} // 추상메서드는 메서드명이 같더라도 한번만 오버라이딩하면 상관없음. void method();
}

public class DefaultInterfaceEx01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2(); //Parent 메서드에 멤버메서드
		MyInterface1.staticMethod();
		MyInterface2.staticMethod(); //바로 사용할 수 있음.
	}
}
