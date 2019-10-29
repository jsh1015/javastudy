package chap10;
/*
 * *클래스와 메서드의 관계*
 */
class Outer2{
	private int outeriv = 10; //인스턴스 멤버
	private static int outercv = 20;
	
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner{ //클래스 멤버
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner(); //클래스 멤버 O
	InstanceInner iv = new InstanceInner(); //인스턴스 멤버 O
	
//	static InstanceInner cv2 = new InstanceInner(); // cv2는 클래스 변수인데 인스턴스 변수 직접접근 X
	static InstanceInner cv2 = new Outer2().new InstanceInner();
	
//	StaticInner iv2 = new StaticInner(); //인스턴스 멤버는 클래스 멤버의 접근 가능
	
	void method(int pv) {
		// **** 지역 내부 클래스에서 사용되는 메서드의 지역변수는 **상수화** 되어야 한다. 변형X
		int i = 0;
//		pv++; //변형이 되면 내부클래스에서 접근 불가능
		class LocalInner{ //지역내부클래스 
			int liv = outeriv; // 외부클래스의 private 멤버 접근 가능
			int liv2 = outercv;// 외부클래스의 private 멤버 접근 가능
			void method() {
				//지역내부클래스에서 내부클래스가 속한 메서드의 지역변수 변경 안됨.
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
