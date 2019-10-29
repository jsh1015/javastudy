package chap10;
/*
 * ������ ���� Ŭ����
 */
interface I {
	void test();
}
abstract class Abs{
	abstract void test();
}

public class InnerEx04 {
	public static void main(String[] args) {
		
		I i = new I() { 
				int iv = 100;
			@Override
			public void test() {
				System.out.println("iv=" + iv);
				System.out.println("����Ŭ������ test �޼���");
			}
		}; //�̸��� ���°Ŷ� �ܺο��� ���Ұ�
		i.test();
		
//		System.out.println(i.iv); // iv�� �������̽� I�� ����� �ƴϱ⶧���� error
		int iv = 100;
//		iv++;
		//������ ����Ŭ������ ��������Ŭ������ ����
		//���������� ���ȭ�� �ʿ���.
		
		Abs a = new Abs(){
			@Override
			void test() {
				System.out.println("Abs ���� Ŭ������ test �޼���");
				System.out.println("iv=" + iv); //�������� iv ��� - iv++�ϸ� error 
			}
		};
		a.test();
	}

}
