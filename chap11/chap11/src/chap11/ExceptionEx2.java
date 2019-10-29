package chap11;
/*
 * ���� catch ���� ����
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException ���� �߻�
			System.out.println(args[0]);
			System.out.println(Integer.parseInt(args[0])); //NumberFormatException ���ܹ߻�
			System.out.println(10/Integer.parseInt(args[0]));
			
			String str = null; //��ü�� ����.
			System.out.println(str.charAt(0)); //��ü�� ���� �޼ҵ� ȣ�� X
			
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ������");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command���ο� �Ķ���͸� �Է��ϼ���");
		}catch(NumberFormatException e) {
			System.out.println("�Ķ���� ���ο� ���ڸ� �Է��ϼ���");
		}catch(RuntimeException e) { //��ü ����ó��
			System.out.println("1. �����߻� : ����η� ��ȭ���");
			e.printStackTrace(); //���° ������ �˷���
		}catch(Exception e) { //��ü ����ó��
			System.out.println("2. �����߻� : ����η� ��ȭ���");
		}
		//����Ŭ������ ���´� �ݵ�� �ؿ� ����� ��. �����ϸ� ������ �� ó���ϱ� ������ ���� ����ó���� ����
		
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//		at chap11.ExceptionEx2.main(ExceptionEx2.java:8)
		
		//ȫ�浿 �Է���
//		ȫ�浿
//		Exception in thread "main" java.lang.NumberFormatException: For input string: "ȫ�浿"
//			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
//			at java.base/java.lang.Integer.parseInt(Integer.java:658)
//			at java.base/java.lang.Integer.parseInt(Integer.java:776)
//			at chap11.ExceptionEx2.main(ExceptionEx2.java:10)		
	}

}
