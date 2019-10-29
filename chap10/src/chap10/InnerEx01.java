package chap10;
/*
 * ���� Ŭ���� ����
 * *Ŭ������ ������� ����*
 * 
 * 		- �ν��Ͻ� ���� Ŭ���� : Ŭ���� ����� ���� �� ����. �� ����� ����
 * 		- static ���� Ŭ���� : Ŭ���� ����� ���� �� �ִ�.
 * 		- ���� ���� Ŭ���� : �޼��� ���� ����� Ŭ����. �޼��� ���ο����� ����� ������.
 * 						Ŭ���� ����� ���� �� ����. �� ����� ����
 * 		- *** ���� ���� Ŭ���� *** : Ŭ���� ���� ��üȭ ������ Ŭ����
 * 								�߻�Ŭ����(����� ���� ��üȭ), �������̽�(������ ���� ��üȭ) �� ��üȭ�� ������.
 * 
 * ����Ŭ������ Ư¡
 * 		1. Ŭ���� ���ο� �����ϴ� Ŭ����
 * 		2. �ڷ������� ����. ��üȭ ����. Object Ŭ������ ���� Ŭ����.
 * 		      ���(����, �޼���, ������)�� ���� �� �� �ִ�. 
 * 		3. * �ܺ� Ŭ������ ��� = �ܺ� Ŭ������ private ����� ���ٰ���.
 */
class Outer1{
	class InstanceInner{	//�ν��Ͻ� ����Ŭ����
		int iv = 100;
//		static int cv=10; //Ŭ���� ����� ���� �� ����.
		final static int MAX = 200; //Ŭ���� ������� ����� ���� �� �ִ�.
	}
	
	static class StaticInner{ //static ����Ŭ����
		int iv = 300;
		static int cv = 400;	//Ŭ���� ����� ���� �� �ִ�.
		final static int MAX = 500;
	}
	
	void method() {
		class LocalInner{	//���� ���� Ŭ���� : �޼��� ���ο����� ����� �� �ִ�.
			// ������ ���� ����. ��� ����. Ŭ������ ���� ������� ��Ҹ� ����������
			int iv = 600;
//			static int cv = 700; //Ŭ���� ����� ���� �� ����.
			final static int MAX = 700; //����� ����
		}
		LocalInner lc = new LocalInner();	//�޼��� ���ο��� ��ü ����
		System.out.println(lc.iv); // 600
		System.out.println(lc.MAX); // 700
		System.out.println(LocalInner.MAX); // 700
	}
	
	void method2() {
//		LoccalInner lc = new LocalInner();  => method() ���ο����� ��밡��
	}
}
public class InnerEx01 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner(); //�ڷ��� �ܺ�Ŭ����.����Ŭ����
		System.out.println(si.iv); // 300
		System.out.println(Outer1.StaticInner.cv); // 400
		System.out.println(Outer1.StaticInner.MAX); // 500
		
		Outer1.InstanceInner ii = new Outer1().new InstanceInner(); //�ܺ�Ŭ���� ��üȭ�� �Ǿ���ϴ� �ν��Ͻ����
		//���Ʒ� ���� �ǹ�
		Outer1 outer = new Outer1(); 
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		
		System.out.println(ii2.iv); // 100
		System.out.println(Outer1.InstanceInner.MAX); // 200 **���**�̱⶧���� �̷��� ���� ����
		outer.method(); // 600, 700, 700
	}

}
