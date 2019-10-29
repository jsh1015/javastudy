package chap08;
class Parent{
	int x=10;
	Parent(int x){
		this.x = x;
	}
}
class Child2 extends Parent{
	int x = 20;
	Child2(){
		super(100);
	}
	void method() {
		int x = 30;
		// x : 1.지역변수 => 2.현재클래스에 속한 멤버중 x => 3.부모클래스의 객체의 멤버 중 x
		System.out.println(x);
		//1.현재클래스에 속한 멤버중 x => 2.부모클래스의 객체의 멤버 중 x
		System.out.println(this.x);
		//부모클래스의 객체의 멤버 중 x
		System.out.println(super.x);
	}
}
public class SuperEx01 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}
