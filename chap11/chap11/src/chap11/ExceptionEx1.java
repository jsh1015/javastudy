package chap11;
/*
 * ����ó��
 * try �� : ���ܰ� �߻��� ���ɼ��� �ִ� �����.
 * 			 ���ܰ� �߻��� ��� ��� catch ������ �̵�.
 * catch �� : ���ܰ� �߻��ϸ� ȣ��Ǵ� ��
 * 			     ���ܰ� �߻��Ǹ�, ���ܴ� ���, ���������� ������ ��.
 *		 	   try ���� �Բ� ����ؾ���.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //ArithmeticException
			//���ܹ߻��� �ٷ� catch �������� ���⶧���� 4�� ��µ��� ����
			System.out.print(4);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ ������");
		}
		System.out.println(5);
//		12Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at chap11.ExceptionEx1.main(ExceptionEx1.java:7)
		//12���� ����� 0���� ��� �ȵǹǷ� ���ܹ߻�
//		// by zero 0���� ������

	}
}
