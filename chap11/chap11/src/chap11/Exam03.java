package chap11;
//한줄만 변경하여 오류 없애기

/*
 * RuntimeException은 예외처리를 생략해도 된다.
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
//		throw new Exception("Exam03.method() 예외 강제 발생");
//		throw new RuntimeException("Exam03.method() 예외 강제 발생");
		
		throw new MyException1("Exam03.method() 예외 강제 발생");
	}
}
