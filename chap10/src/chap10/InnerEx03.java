package chap10;
/*
 * 내부클래스 객체에서 사용되는 this
 */
class Outer3{
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
//			int iv = 300;
			System.out.println("iv=" + iv); //300 -> 100  지역변수 없으면 멤버변수 아니면 외부클래스
			System.out.println("this.iv=" + this.iv); //100 -> 100  this는 InstanceInner이기 때문에 멤버변수 없으면 에러 
			
			//Outer3.this.iv : Outer3 클래스의 멤버 변수 iv 값
			Outer3.this.iv = 50; //변경 가능
			System.out.println("Outer3.this.iv=" + Outer3.this.iv); //10 -> 50
		}
	}
}
public class InnerEx03 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method1();
	}

}
