package chap10;
/*
 * ����Ŭ���� ��ü���� ���Ǵ� this
 */
class Outer3{
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
//			int iv = 300;
			System.out.println("iv=" + iv); //300 -> 100  �������� ������ ������� �ƴϸ� �ܺ�Ŭ����
			System.out.println("this.iv=" + this.iv); //100 -> 100  this�� InstanceInner�̱� ������ ������� ������ ���� 
			
			//Outer3.this.iv : Outer3 Ŭ������ ��� ���� iv ��
			Outer3.this.iv = 50; //���� ����
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
