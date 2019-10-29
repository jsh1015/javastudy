package chap11;
class Outer2{
	static class Inner{	//클래스멤버
		int iv = 200; //인스턴스멤버
	}
}
public class Test0917_3 {
	public static void main(String[] args) {
		Outer2.Inner oi2 = new Outer2.Inner();
		System.out.println(oi2.iv);
	}
}
