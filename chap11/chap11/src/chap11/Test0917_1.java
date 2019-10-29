package chap11;

interface Beta {
//	String testIt();
}

class Alpha implements Beta {
	public String testIt() { 
		return "Tested";
	}
}

public class Test0917_1 {
	 static Beta getIt() {
		 return new Alpha(); //Beta 인터페이스를 구현한 구현클래스의 객체
	 }

	 public static void main(String[] args) {
		 Beta b = getIt();
//		 Alpha a = (Alpha)b;
//		 System.out.println(a.testIt());
		 System.out.println(((Alpha)b).testIt());
	 }
}
//b는 Beta의 객체인데 Beta인터페이스 내에 testIt()메서드가 없기때문에 오류가 발생한다.
//그러므로 인터페이스 안에 testIt 추상메서드를 만든다.
