package chap07;
/*
 * call stack ����
 * ��͸޼���(�Լ�) : �ڽ��� �ڽ� �޼��带 �ٽ� ȣ���ϴ� �޼���
 * 		=> ���� ������ �����ϹǷ� ������.
 */
public class FactorialEx {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
	}
	public static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1); //����Լ�(�ڱ��ڽ��� ȣ���� �� �ִ� �Լ�)
	}

}
