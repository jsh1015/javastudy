package chap12;
/*
 * 숫자형 문자열을 숫자로 변경
 * parseXXX() 메서드
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123");
		System.out.println(is); //123
		is = Integer.parseInt("123",8); //8진수
		System.out.println(is); //83
		is = Integer.parseInt("123",16); //16진수
		System.out.println(is); //291
		float f = Float.parseFloat("123.45");
		System.out.println(f); //123.45
		f = Float.parseFloat("123.45f");
		System.out.println(f); //123.45
		double d = Double.parseDouble("123.45");
		System.out.println(d);//123.45
		System.out.println(Integer.toBinaryString(500)); //111110100
		System.out.println(Integer.toOctalString(500)); //764 8진수
		System.out.println(Integer.toHexString(500)); //1f4 16진수
		Float f2 = 123.45f;
		System.out.println(f2);
	}
}
