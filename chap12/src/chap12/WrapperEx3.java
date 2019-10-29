package chap12;
/*
 * ������ ���ڿ��� ���ڷ� ����
 * parseXXX() �޼���
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123");
		System.out.println(is); //123
		is = Integer.parseInt("123",8); //8����
		System.out.println(is); //83
		is = Integer.parseInt("123",16); //16����
		System.out.println(is); //291
		float f = Float.parseFloat("123.45");
		System.out.println(f); //123.45
		f = Float.parseFloat("123.45f");
		System.out.println(f); //123.45
		double d = Double.parseDouble("123.45");
		System.out.println(d);//123.45
		System.out.println(Integer.toBinaryString(500)); //111110100
		System.out.println(Integer.toOctalString(500)); //764 8����
		System.out.println(Integer.toHexString(500)); //1f4 16����
		Float f2 = 123.45f;
		System.out.println(f2);
	}
}
