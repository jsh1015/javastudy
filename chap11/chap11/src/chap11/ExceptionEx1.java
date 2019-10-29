package chap11;
/*
 * 예외처리
 * try 블럭 : 예외가 발생할 가능성이 있는 문장들.
 * 			 예외가 발생한 경우 제어가 catch 블럭으로 이동.
 * catch 블럭 : 예외가 발생하면 호출되는 블럭
 * 			     예외가 발생되면, 예외는 잡고, 정상적으로 실행을 함.
 *		 	   try 블럭과 함께 사용해야함.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2);
			System.out.print(3/0); //ArithmeticException
			//예외발생후 바로 catch 구문으로 가기때문에 4가 출력되지 않음
			System.out.print(4);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		}
		System.out.println(5);
//		12Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at chap11.ExceptionEx1.main(ExceptionEx1.java:7)
		//12까지 출력후 0으로 계산 안되므로 예외발생
//		// by zero 0으로 나눠서

	}
}
