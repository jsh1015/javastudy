package chap10;
/*
 * *Ŭ������ �޼����� ����*
 */
class Outer2{
	private int outeriv = 10; //�ν��Ͻ� ���
	private static int outercv = 20;
	
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{ //Ŭ���� ���
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner(); //Ŭ���� ��� O
	InstanceInner iv = new InstanceInner(); //�ν��Ͻ� ��� O
	
//	static InstanceInner cv2 = new InstanceInner(); // cv2�� Ŭ���� �����ε� �ν��Ͻ� ���� �������� X
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	
//	StaticInner iv2 = new StaticInner(); //�ν��Ͻ� ����� Ŭ���� ����� ���� ����
	
	void method(int pv) {
		// **** ���� ���� Ŭ�������� ���Ǵ� �޼����� ���������� **���ȭ** �Ǿ�� �Ѵ�. ����X
		int i = 0;
//		pv++; //������ �Ǹ� ����Ŭ�������� ���� �Ұ���
		class LocalInner{ //��������Ŭ���� 
			int liv = outeriv; // �ܺ�Ŭ������ private ��� ���� ����
			int liv2 = outercv;// �ܺ�Ŭ������ private ��� ���� ����
			void method() {
				//��������Ŭ�������� ����Ŭ������ ���� �޼����� �������� ���� �ȵ�.
//				i = 100; 
//				pv++;
				System.out.println("pv=" + pv );
				System.out.println(liv + "," + liv2);
				System.out.println(outeriv + "," + outercv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx02 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);
		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}
