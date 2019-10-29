package chap11;
class Outer1{
	class Inner{
		int iv = 100;
	}
}
public class Test0917_2 {
	public static void main(String[] args) {
		Outer1.Inner oi = new Outer1().new Inner();
		System.out.println(oi.iv);
//		System.out.println(new Outer1().new Inner().iv);
	}
}
