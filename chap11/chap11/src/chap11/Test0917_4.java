package chap11;
class Outer3{
	int value = 10;
	class Inner{
		int value = 20;
		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);	//���� �������
			System.out.println(Outer3.this.value); //�ܺο��ִ� ����
		}
	}
}
public class Test0917_4 {
	public static void main(String[] args) {
		Outer3.Inner oi = new Outer3().new Inner();
		oi.method1();
	}
}
