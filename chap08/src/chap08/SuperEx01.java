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
		// x : 1.�������� => 2.����Ŭ������ ���� ����� x => 3.�θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(x);
		//1.����Ŭ������ ���� ����� x => 2.�θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(this.x);
		//�θ�Ŭ������ ��ü�� ��� �� x
		System.out.println(super.x);
	}
}
public class SuperEx01 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}

}
