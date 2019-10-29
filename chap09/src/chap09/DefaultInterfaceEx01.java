package chap09;
/*
 * jdk 8.0 ���Ŀ� �������̽��� �����θ� ���� �޼��带 ����� ���� �� �ִ�
 * 
 * 		default �޼��� : �ν��Ͻ� ���
 * 					      ���� ������ �����ϹǷ� �Ȱ��� default �޼��尡 ������ �� �ִ�.
 * 					     => ����Ŭ�������� �������̵��� �ʿ���.
 * 		static �޼���  : Ŭ���� ���
 */
interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1�� default �޼��� : method1()"); //c.method1()
	}
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼��� : staticMethod()"); //c.method1()
	}
}
interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface1�� default �޼��� : method1()"); //c.method1()
	}
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼��� : staticMethod()"); //c.method1()
	}
}

class Parent{
	public void method2() {
		System.out.println("Parent Ŭ������ ��� �޼��� : method2()");
	}
}
class Child extends Parent implements MyInterface1,MyInterface2 { //�޼������ ���⶧���� : �������̵��ؾ���
	/*
	 * MyInterface1,MyInterface2 �������̽��� method1 default �޼��尡 �浹�߻�
	 * => Child Ŭ�������� �ݵ�� �������̵� �ؾ���.
	 */
	@Override
	public void method1() {
		MyInterface1.super.method1(); //MyInterface1�� method1�� ��������� ����
	}

@Override
public void method() {
	System.out.println("Child Ŭ������ method()");
	System.out.println("MyInterface1, MyInterface2 �������̽��� �߻�޼��� method �������̵���");
} // �߻�޼���� �޼������ ������ �ѹ��� �������̵��ϸ� �������. void method();
}

public class DefaultInterfaceEx01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2(); //Parent �޼��忡 ����޼���
		MyInterface1.staticMethod();
		MyInterface2.staticMethod(); //�ٷ� ����� �� ����.
	}
}
