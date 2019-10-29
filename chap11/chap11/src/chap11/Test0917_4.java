package chap11;
class Outer3{
	int value = 10;
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);	//나의 멤버변수
			System.out.println(Outer3.this.value); //외부에있는 변수
		}
	}
}
public class Test0917_4 {
	public static void main(String[] args) {
		Outer3.Inner oi = new Outer3().new Inner();
		oi.method1();
	}
}
