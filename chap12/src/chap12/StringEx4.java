package chap12;
/*
 * String 은 정적인 문자열임
 */
public class StringEx4 {
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main : "+str);
		str = change(str); //str 리턴값으로 변경
		System.out.println("change 이후 main : "+ str);
	}
	static String change(String str) {
		str += "456";
		System.out.println("change() s :"+ str);
		return str; //str 주소 리턴
	}
}
