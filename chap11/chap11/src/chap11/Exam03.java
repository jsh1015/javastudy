package chap11;
//���ٸ� �����Ͽ� ���� ���ֱ�

/*
 * RuntimeException�� ����ó���� �����ص� �ȴ�.
 */
class MyException1 extends RuntimeException{
	MyException1(String msg){
		super(msg);
	}
}

public class Exam03 {
	public static void main(String[] args) {
		method();
	}
	
	private static void method() {
//		throw new Exception("Exam03.method() ���� ���� �߻�");
//		throw new RuntimeException("Exam03.method() ���� ���� �߻�");
		
		throw new MyException1("Exam03.method() ���� ���� �߻�");
	}
}
